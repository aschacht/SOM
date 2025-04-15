package visulization;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.RealMatrix;

import src.NuronMetaStructure;

public class PCA {
	public static double[][] reduceDimensions(NuronMetaStructure[] data, int targetDimensions) {
        // Step 1: Compute the mean of each column (feature)
        int rows = data.length;
        int cols = data[0].getDimensions();
        double[] mean = new double[cols];
        for (int j = 0; j < rows; j=j+cols) {
            for (int i = 0; i < cols; i++) {  
					for (int k = 0; k < 7; k++) {
						mean[i] += data[j].getVectorOfNuron().getNdimension(k);
					}
					mean[i] /= rows;
            }
        }

        // Step 2: Center the data by subtracting the mean
        double[][] centeredData = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	
                centeredData[i][j] = data[i].getVectorOfNuron().getNdimension(j) - mean[j];
            	
            }
        }

        // Step 3: Compute the covariance matrix
        RealMatrix matrix = new Array2DRowRealMatrix(centeredData);
        RealMatrix covarianceMatrix = matrix.transpose().multiply(matrix).scalarMultiply(1.0 / (rows - 1));
        if (!covarianceMatrix.equals(covarianceMatrix.transpose())) {
            throw new IllegalArgumentException("Covariance matrix is not symmetric.");
        }
        // Step 4: Perform eigen decomposition
        EigenDecomposition eigenDecomposition = new EigenDecomposition(covarianceMatrix);
        double[] eigenValues = eigenDecomposition.getRealEigenvalues();
        RealMatrix eigenVectors = eigenDecomposition.getV();

        // Step 5: Sort eigenvalues and eigenvectors in descending order
        Integer[] indices = new Integer[eigenValues.length];
        for (int i = 0; i < eigenValues.length; i++) {
            indices[i] = i;
        }
        java.util.Arrays.sort(indices, (i, j) -> Double.compare(eigenValues[j], eigenValues[i]));

        // Step 6: Select the top 'targetDimensions' eigenvectors
        double[][] topEigenVectors = new double[cols][targetDimensions];
        for (int i = 0; i < targetDimensions; i++) {
            int index = indices[i];
            for (int j = 0; j < cols; j++) {
                topEigenVectors[j][i] = eigenVectors.getEntry(j, index);
            }
        }

        // Step 7: Project the data onto the new subspace
        RealMatrix projectionMatrix = new Array2DRowRealMatrix(topEigenVectors);
        RealMatrix reducedData = matrix.multiply(projectionMatrix);

        return reducedData.getData();
    }
}
