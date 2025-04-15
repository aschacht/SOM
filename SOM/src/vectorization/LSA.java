package vectorization;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import src.NuronMetaStructure;
import src.nuron;
import src.vector;
import org.apache.commons.math3.linear.*;

import java.util.HashMap;
import java.util.Map;

public class LSA {

    public static String readFileAsString(String filePath) throws IOException {
        // Read all bytes from the file and convert to a string
        return Files.readString(Path.of(filePath));
    }

	public static vector[] LSA() {

		String[] documents = new String[2];
		try {
			String filePath = "/home/wes/git/SOM/SOM/SOM/res/doc1.txt"; // Replace with your file path
			String lines = readFileAsString(filePath);

			String filePath2 = "/home/wes/git/SOM/SOM/SOM/res/doc2.txt"; // Replace with your file path
			String lines2 = readFileAsString(filePath2);
			
			
			documents[0] = lines;
			documents[1] = lines2;
		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
		}
 System.out.println(documents[0]);


		// Build term-document matrix
		Map<String, Integer> termIndex = buildTermIndex(documents);
		RealMatrix matrix = buildTermDocumentMatrix(documents, termIndex);

		// Perform Singular Value Decomposition (SVD)
		SingularValueDecomposition svd = new SingularValueDecomposition(matrix);
		RealMatrix termMatrix = svd.getU(); // U matrix (terms x concepts)
		RealMatrix docMatrix = svd.getV(); // V matrix (documents x concepts)

		// Print the term matrix
		System.out.println("Term Matrix (U):");
		vector[] meta = new vector[termMatrix.getRowDimension()]; 
		for (int i = 0; i < termMatrix.getRowDimension(); i++) {
			double[] row = new double[termMatrix.getColumnDimension()];
			for (int j = 0; j < termMatrix.getColumnDimension(); j++) {
				System.out.print(termMatrix.getEntry(i, j) + " ");
				row[j] = termMatrix.getEntry(i, j);
			}
			
			meta[i]= new vector(row);
			
			
			
			

			System.out.println();
		}
		
		
		System.out.println("Document Matrix (V):");
		return meta;

	}

	private static Map<String, Integer> buildTermIndex(String[] documents) {
		Map<String, Integer> termIndex = new HashMap<>();
		int index = 0;

		for (String doc : documents) {
			String[] terms = doc.split(" ");
			for (String term : terms) {
				if (!termIndex.containsKey(term)) {
					termIndex.put(term, index++);
				}
			}
		}

		return termIndex;
	}

	private static RealMatrix buildTermDocumentMatrix(String[] documents, Map<String, Integer> termIndex) {
		double[][] matrixData = new double[termIndex.size()][documents.length];

		for (int j = 0; j < documents.length; j++) {
			String[] terms = documents[j].split(" ");
			for (String term : terms) {
				int index = termIndex.get(term);
				matrixData[index][j]++;
			}
		}

		return MatrixUtils.createRealMatrix(matrixData);
	}

}
