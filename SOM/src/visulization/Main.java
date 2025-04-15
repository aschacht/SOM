package visulization;

import javax.swing.*;

import src.NuronMetaStructure;
import src.nuron;
import src.vector;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// Example dataset: 512 samples with 13 features
		NuronMetaStructure[] data = generateRandomData(128, 128); // 32x16 grid

		// Reduce to 4 dimensions (RGBA)
		double[][] reducedData = PCA.reduceDimensions(data, 4);

		// Create and display the image
		displayReducedDataAsGrid(reducedData, 128, 128);
	}

	private static void displayReducedDataAsGrid(double[][] reducedData, int rows, int cols) {
		// Create a BufferedImage with the grid dimensions
		BufferedImage image = new BufferedImage(cols, rows, BufferedImage.TYPE_INT_ARGB);

		// Map reduced data to RGBA and set pixels
		for (int i = 0; i < rows; i++) {
			
			
			for (int j = 0; j < cols; j++) {
				int index = i*cols + j; // Calculate the index in the reduced data array;
				double[] vector = reducedData[index];
				int r = (int) Math.min(255, Math.max(0, vector[0] * 255)); // Scale to 0-255
				int g = (int) Math.min(255, Math.max(0, vector[1] * 255));
				int b = (int) Math.min(255, Math.max(0, vector[2] * 255));
				int a = (int) Math.min(255, Math.max(0, vector[3] * 255));
				int rgba = (a << 24) | 
						(r << 16) | (g << 8) | b; // Combine into ARGB
				image.setRGB(j, i, rgba);

				
				}
		}

		// Display the image in a JFrame
		JFrame frame = new JFrame("Reduced Data Grid Visualization");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(cols * 10, rows * 10); // Scale for visibility
		frame.add(new JLabel(new ImageIcon(image.getScaledInstance(cols * 10, rows * 10, Image.SCALE_FAST))));
		frame.setVisible(true);
	}

	private static NuronMetaStructure[] generateRandomData(int rows, int cols) {

		nuron data = new nuron(new vector(0,0,0,0,0,0,0));
		NuronMetaStructure[] datam = new NuronMetaStructure[rows*cols];
		Random random = new Random();
		for (int j = 0; j < rows; j++) {

			for (int i = 0; i < cols; i++) {
				for (int k = 0; k < 7; k++) {
					data.getVectorOfNuron().setNDimension(k, random.nextDouble()); 
				}
				datam[j*cols+i] = data;
				data = new nuron(new vector(0,0,0,0,0,0,0));				
			}
		}
		return datam;
	}
}