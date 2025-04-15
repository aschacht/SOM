package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import vectorization.LSA;
import visulization.PCA;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JTabbedPane;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Component;
import java.awt.Container;

public class TutorialNetworksOne extends WhistlesRibbionsSpinnersAnd {

	private static boolean huh = false;
	private static boolean what = huh;

	private static final String Experiment_1_NAME = "SOM Basics";
	private static final String Experiment_2_NAME = "SOM varient 0";
	private static final String Experiment_3_NAME = "SOM varient 1";
	private static final int SOMSIMMULATIONUCOUNTLOWERLIMIT = 0;
	private static final int SOMSIMMULATIONUCOUNTUPPERLIMIT = 10000;
	private static int CURRENTVIEWOFACTIVENETWORK = 0;

	private static final String CURRENT__LOGGING_CHANNEL_ZERO_TO_INITILIZE_JPG = "well...would you like to cometo my murdermystery pool party....jpg";
	private static final String CURRENT__LOGGING_CHANNEL_ONE_TO_INITILIZE_JPG = "well welll welll now that went over welll well well.jpg";
	private static final String CURRENT__LOGGING_CHANNEL_TWO_TO_INITILIZE_JPG = "CURRENT__LOGGING_CHANNEL_TWO_.jpg";
	private static final String LOGGINGACTIVERUN = "activeRun" + CURRENTVIEWOFACTIVENETWORK + ".txt";

	private static final String FILE_TO_LOAD_JPG = "whatIsLove.jpg";
	private static String currentWorkspaceDirectory = "/home/wes/git/SOM/SOM/SOM";
	private static String nicePictureToShowWhenNotLogging = "/home/wes/git/SOM/SOM/SOM/res/1.jpg";

	private static String nice_picture_to_show_when_you_have_decided_to_log_absolutePath_where_logging_is_enabled = currentWorkspaceDirectory
			+ "/res/DATA/IMAGE/IMAGES/" + CURRENT__LOGGING_CHANNEL_ZERO_TO_INITILIZE_JPG;

	private static String nice_picture_to_show_when_you_have_decided_to_log_absolutePath_where_logging_is_enabled_so_herer_we_goooooo = currentWorkspaceDirectory
			+ "/res/DATA/IMAGE/IMAGES/" + CURRENT__LOGGING_CHANNEL_ONE_TO_INITILIZE_JPG;

	private static String nice_picture_to_show_when_you_have_decided_to_log_absolutePath_where_logging_is_enabled_so_herer_we_goooooo_why_wuold_you_ever_not_do_ = currentWorkspaceDirectory
			+ "/res/DATA/IMAGE/IMAGES/" + CURRENT__LOGGING_CHANNEL_TWO_TO_INITILIZE_JPG;

	private static double some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_woke_up_in_a_video_store_naked_and_alone;
	private static double some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_do_dumpty_da_dup_dup_duppppppppppreeeeeeeeeeeeeeeeeeeeeeeee_deeeeeeeeeeeeeeeee_oplacodia_a_a_a_a_a_glue;
	private static int height = 1024;
	private static int width = 1024;

	private static Graphics PANE_ONE_CHANNEL;
	private static Graphics PANE_TWO_CHANNEL;
	private static Graphics PANE_THREE_CHANNEL;
	private static SOMAction trainSOM;

	static ArrayList<NuronMetaStructure> neighborhoodList;
	static ArrayList<NuronMetaStructure> ghettoList;
	static ArrayList<NuronMetaStructure> gatedCommunityList;
	private static JFrame frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0;
	private static JLabel imageForSeed3;
	private static ImageIcon image3;
	private static BufferedImage img3;
	private static JLabel imageForSeed2;
	private static ImageIcon image2;
	private static BufferedImage img2;
	private static JLabel imageForSeed;
	private static ImageIcon image;
	private static BufferedImage img;
	private static JTextArea LearningFactorText = new JTextArea();
	private static JTextArea neighborhoodtext = new JTextArea();
	private static JTextArea txtrWidth = new JTextArea();
	private static JTextArea txtrHeight = new JTextArea();
	private static JTextArea txtrCurrentItterationOfSim = new JTextArea();
	private static JButton btnFileChooser = new JButton();
	private static Panel infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario = new Panel();;
	private static JPanel pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1 = new JPanel();
	private static JTabbedPane tabbedPaneThiSis____thisdisplays_inaTUBULARtabformationthisiswhereeachCHANNELisADDED = new JTabbedPane();
	private static JPanel pane2ThiSis____AHellohowareyathisis_a_whahooooooo_and_it_is_pane2 = new JPanel();
	private static JPanel pane3ThiSis____AHhHhahahaDESIGNeL3ment_and_it_ispane3 = new JPanel();

	// WITHOUTLOGGING
	private static int widthOfNeighborhood = 32;
	private static double learningFactor = 0.4;
	private static JTextArea txtrThisIsNeat;
	private static ArrayList<vector> trainingList;
	private static ArrayList<JTextArea> factsaboutanexperimentthatisrunning;
	private static int saveCount = 0;

	private void buildExperiment1GUIElements() {

	}

	public static void main(String[] args) throws IOException {
// LOGGing

		CURRENTVIEWOFACTIVENETWORK = 0;
		runsetup();
		runsimulationin(SOMSIMMULATIONUCOUNTLOWERLIMIT);
	}

	private static void runsetup() throws IOException {

		some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_woke_up_in_a_video_store_naked_and_alone = 0;
		some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_do_dumpty_da_dup_dup_duppppppppppreeeeeeeeeeeeeeeeeeeeeeeee_deeeeeeeeeeeeeeeee_oplacodia_a_a_a_a_a_glue = 1;

		buildSOMACTON_and_generate_training_vectors();

		setupDisplayStuff();

		PANE_ONE_CHANNEL = img.createGraphics();
		PANE_TWO_CHANNEL = img2.createGraphics();
		PANE_THREE_CHANNEL = img3.createGraphics();
		neighborhoodList = trainSOM.nP.getNuronList();
		ghettoList = trainSOM.gP.getNuronList();
		gatedCommunityList = trainSOM.gCP.getNuronList();
	}

	private static void setupDisplayStuff() throws IOException {

		factsaboutanexperimentthatisrunning = new ArrayList<JTextArea>();
		txtrThisIsNeat = new JTextArea();
		txtrHeight = new JTextArea();
		txtrWidth = new JTextArea();
		neighborhoodtext = new JTextArea();
		LearningFactorText = new JTextArea();
		for (int q = 0; q < 1; q++) {
			makeapretendfactaboutblankMILKHASSAssssoomeeeaspectthat_makes_it_invisiable_to_every_one_from_the_fire_dimensions();
		}

		img = ImageIO.read(new File(nicePictureToShowWhenNotLogging));
		img2 = ImageIO.read(new File(nicePictureToShowWhenNotLogging));
		img3 = ImageIO.read(new File(nicePictureToShowWhenNotLogging));

		image = new ImageIcon(img);
		imageForSeed = new JLabel(image);
		image2 = new ImageIcon(img2);
		imageForSeed2 = new JLabel(image2);
		image3 = new ImageIcon(img3);
		imageForSeed3 = new JLabel(image3);

		// displaystuff
		frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0 = new JFrame("FrameDemo");
		pane3ThiSis____AHhHhahahaDESIGNeL3ment_and_it_ispane3 = new JPanel(); // use
		pane2ThiSis____AHellohowareyathisis_a_whahooooooo_and_it_is_pane2 = new JPanel(); // use
		pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1 = new JPanel(); // use

		infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario = new Panel();

		final JFileChooser fc = new JFileChooser();
		final JTextArea backgroundimage = new JTextArea();
		JButton btnFileChooser = new JButton("file");

		tabbedPaneThiSis____thisdisplays_inaTUBULARtabformationthisiswhereeachCHANNELisADDED = new JTabbedPane(
				JTabbedPane.TOP);

		tabbedPaneThiSis____thisdisplays_inaTUBULARtabformationthisiswhereeachCHANNELisADDED.addTab(Experiment_1_NAME,
				null, pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1, null);
		tabbedPaneThiSis____thisdisplays_inaTUBULARtabformationthisiswhereeachCHANNELisADDED.addTab(Experiment_2_NAME,
				null, pane2ThiSis____AHellohowareyathisis_a_whahooooooo_and_it_is_pane2, null);
		tabbedPaneThiSis____thisdisplays_inaTUBULARtabformationthisiswhereeachCHANNELisADDED.addTab(Experiment_3_NAME,
				null, pane3ThiSis____AHhHhahahaDESIGNeL3ment_and_it_ispane3, null);

		if (AREWELOGGING) {
			backgroundimage
					.setText(nice_picture_to_show_when_you_have_decided_to_log_absolutePath_where_logging_is_enabled);
		} else {
			backgroundimage.setText(nicePictureToShowWhenNotLogging);
		}

		frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1
				.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		pane2ThiSis____AHellohowareyathisis_a_whahooooooo_and_it_is_pane2
				.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		pane3ThiSis____AHhHhahahaDESIGNeL3ment_and_it_ispane3.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1
				.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		pane2ThiSis____AHellohowareyathisis_a_whahooooooo_and_it_is_pane2
				.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		pane3ThiSis____AHhHhahahaDESIGNeL3ment_and_it_ispane3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
				.setLayout(new GridLayout(7, 1, 0, 0));

		pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1
				.add(infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario);

		infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
				.add(backgroundimage);

		frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0.getContentPane().add(
				tabbedPaneThiSis____thisdisplays_inaTUBULARtabformationthisiswhereeachCHANNELisADDED,
				BorderLayout.NORTH);

		infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
				.add(btnFileChooser);
		btnFileChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				fc.showOpenDialog(frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0);
				nicePictureToShowWhenNotLogging = fc.getSelectedFile().getAbsolutePath();
				backgroundimage.setText(nicePictureToShowWhenNotLogging);
				BufferedImage img = null;
				try {
					img = ImageIO.read(new File(nicePictureToShowWhenNotLogging));
				} catch (IOException e1) {
				}
				ImageIcon image = new ImageIcon(img);
				JLabel imageForSeed = new JLabel(image);
				Component[] components = pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1
						.getComponents();

				for (int i = 0; i < components.length; i++) {
					if (components[i] instanceof JLabel) {
						components[i] = imageForSeed;
					}
				}
				;

			}
		});

		factsaboutanexperimentthatisrunning.add(txtrThisIsNeat);
		infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
				.add(txtrThisIsNeat);

		factsaboutanexperimentthatisrunning.add(txtrHeight);
		infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
				.add(txtrHeight);
		factsaboutanexperimentthatisrunning.add(txtrWidth);

		infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario.add(txtrWidth);
		factsaboutanexperimentthatisrunning.add(neighborhoodtext);

		txtrThisIsNeat.setText("Iteration Count: -1");
		txtrHeight.setText("height: " + height);
		txtrWidth.setText("width: " + width);
		neighborhoodtext.setText("Neighborhood width: " + widthOfNeighborhood);
		LearningFactorText.setText("Learning Factor: " + learningFactor);

		infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
				.add(neighborhoodtext);
		factsaboutanexperimentthatisrunning.add(LearningFactorText);
		infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
				.add(LearningFactorText);

		imageForSeed.setHorizontalAlignment(SwingConstants.TRAILING);

		pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1.add(imageForSeed);
		pane2ThiSis____AHellohowareyathisis_a_whahooooooo_and_it_is_pane2.add(imageForSeed2);
		pane3ThiSis____AHhHhahahaDESIGNeL3ment_and_it_ispane3.add(imageForSeed3);

	}

	private static void buildSOMACTON_and_generate_training_vectors() {
		trainSOM = new SOMAction(learningFactor, widthOfNeighborhood);

//		generateTrainingVectors(width, height);
		generateTrainingVectorsFromText();
		
		
	}

	private static void generateTrainingVectorsFromText() {


		trainingList = new ArrayList<vector>();
		
		
		
		vector[] lsa = LSA.LSA();
		
		
		for (int i = 0; i < lsa.length; i++) {
			vector tempVec0 = new vector(0, 0, 0, lsa[i].dimensions[0], lsa[i].dimensions[1]);
			trainingList.add(tempVec0);
		}
	
		
	}

	private static void makeapretendfactaboutblankMILKHASSAssssoomeeeaspectthat_makes_it_invisiable_to_every_one_from_the_fire_dimensions(
			JTextArea jTextArea) {
		// TODO Auto-generated method stub

	}

	private static void makeapretendfactaboutblankMILKHASSAssssoomeeeaspectthat_makes_it_invisiable_to_every_one_from_the_fire_dimensions() {
		JTextArea interesting_odd_and_wackado = new JTextArea();
		interesting_odd_and_wackado.setText(
				"[interesting_odd_and_wackado]hey sorry bout that this is trickey which one knows which way to goOSCAR FOSCAR OLLYOLLY YOSKER");
		factsaboutanexperimentthatisrunning.add(interesting_odd_and_wackado);
		infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
				.add(interesting_odd_and_wackado);

	}

	private static void runsimulationin(int count) {

		while (count < SOMSIMMULATIONUCOUNTUPPERLIMIT) {
			// LOG.println("Current Iteration " + count);
			txtrThisIsNeat.setText("Iteration Count: " + count);
			NuronMetaStructure[] nuronNei = new NuronMetaStructure[neighborhoodList.size()];
			for (int k = 0; k < neighborhoodList.size(); k++) {
				nuronNei[k] = neighborhoodList.get(k);
			}

			double[][] reducedData = PCA.reduceDimensions(nuronNei, 4);
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {

					NuronMetaStructure nuronN = neighborhoodList.get(j + (i * height));

					NuronMetaStructure nuronG = ghettoList.get(j + (i * height));
					NuronMetaStructure nuronC = gatedCommunityList.get(j + (i * height));
					int index = i * width + j; // Calculate the index in the reduced data array;
					double[] vector = reducedData[index];

					int wN = (int) Math.min(255, Math.max(0, vector[0] * 255)); // Scale to 0-255
					int w1N = (int) Math.min(255, Math.max(0, vector[1] * 255));
					int w2N = (int) Math.min(255, Math.max(0, vector[2] * 255));
					int w3N = (int) Math.min(255, Math.max(0, vector[3] * 255));

					int wG = (int) (nuronG.getVectorOfNuron().dimensions[3]);
					int w1G = (int) (nuronG.getVectorOfNuron().dimensions[4]);
					int w2G = (int) (nuronG.getVectorOfNuron().dimensions[5]);

					int wC = (int) (nuronC.getVectorOfNuron().dimensions[3]);
					int w1C = (int) (nuronC.getVectorOfNuron().dimensions[4]);
					int w2C = (int) (nuronC.getVectorOfNuron().dimensions[5]);

					if (wG > 255) {
						wG = 255;
					}
					if (wG < 0) {
						wG = 0;
					}
					if (w1G > 255) {
						w1G = 255;
					}
					if (w1G < 0) {
						w1G = 0;
					}
					if (w2G > 255) {
						w2G = 255;
					}
					if (w2G < 0) {
						w2G = 0;
					}

					if (wN > 255) {
						wN = 255;
					}
					if (wN < 0) {
						wN = 0;
					}
					if (w1N > 255) {
						w1N = 255;
					}
					if (w1N < 0) {
						w1N = 0;
					}
					if (w2N > 255) {
						w2N = 255;
					}
					if (w2N < 0) {
						w2N = 0;
					}
					if (w3N > 255) {
						w3N = 255;
					}
					if (w3N < 0) {
						w3N = 0;
					}

					if (wC > 255) {
						wC = 255;
					}
					if (wC < 0) {
						wC = 0;
					}
					if (w1C > 255) {
						w1C = 255;
					}
					if (w1C < 0) {
						w1C = 0;
					}
					if (w2C > 255) {
						w2C = 255;
					}
					if (w2C < 0) {
						w2C = 0;
					}

					Color SOMCOLOR = new Color(wN, w1N, w2N, w3N);
					Color SOMGHETTOCOLOR = new Color(wG, w1G, w2G);
					Color SOMGATEDCOMMUNITY = new Color(wC, w1C, w2C);

					PANE_ONE_CHANNEL.setColor(SOMCOLOR);
					PANE_TWO_CHANNEL.setColor(SOMGHETTOCOLOR);
					PANE_THREE_CHANNEL.setColor(SOMGATEDCOMMUNITY);

					PANE_ONE_CHANNEL.drawRect(i, j, 1, 1);
					PANE_TWO_CHANNEL.drawRect(i, j, 1, 1);
					PANE_THREE_CHANNEL.drawRect(i, j, 1, 1);
				}
			}

			String path = "";
			if (saveCount < 10) {
				path = "/home/wes/git/SOM/SOM/SOM/res/som/000" + saveCount + ".png";
			} else if (saveCount < 100) {
				path = "/home/wes/git/SOM/SOM/SOM/res/som/00" + saveCount + ".png";
			} else if (saveCount < 1000) {
				path = "/home/wes/git/SOM/SOM/SOM/res/som/0" + saveCount + ".png";
			} else
				path = "/home/wes/git/SOM/SOM/SOM/res/som/" + saveCount + ".png";

			File outputfile = new File(path);
			saveCount++;
			try {
				ImageIO.write(img, "png", outputfile);
			} catch (IOException e) {

				e.printStackTrace();
			}
			frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0.pack();
			frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0.setVisible(true);
			frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0.repaint();

			// LOG.println("SOMSIMMULATIONUCOUNTLOWERLIMIT: " + count);

			// trainSOM.train(new vector(0,0,0,255,0,0,0),
			// some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_woke_up_in_a_video_store_naked_and_alone);
			trainSOM.train(trainingList.get(count),
					some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_woke_up_in_a_video_store_naked_and_alone);
			count++;
		}
		PANE_ONE_CHANNEL.dispose();
		PANE_TWO_CHANNEL.dispose();
		PANE_THREE_CHANNEL.dispose();
		trainSOM.dispose();
		CURRENTVIEWOFACTIVENETWORK++;

	}

	private static void generateTrainingVectors(int width, int height) {
		trainingList = new ArrayList<vector>();
		// red

		// 1024x1024 = 1,048,576
		File file = new File("/home/wes/git/SOM/SOM/SOM/res/T");
		try {
			byte[] fileContent = Files.readAllBytes(file.toPath());
			System.out.println("bytes in T: " + fileContent.length);
			int fileContentCount = 0;
			for (int j = 0; j < height; j++) {
				for (int i = 0; i < width; i++) {

					if (fileContentCount < fileContent.length) {
						int red = fileContent[fileContentCount];
						fileContentCount++;

						int green = 0;
						if (fileContentCount < fileContent.length) {
							green = fileContent[fileContentCount] ;
							fileContentCount++;
						} else {
						 green = (int) (Math.random() * 55);
						}
						
						
						
						
						int blue = 0;
						if (fileContentCount < fileContent.length) {
							blue = fileContent[fileContentCount];
							fileContentCount++;
						} else {
							blue = (int) (Math.random() * 55);
						}
						int alpha = 0;
						if (fileContentCount < fileContent.length) {
							alpha = fileContent[fileContentCount] ;
							fileContentCount++;
						} else {
							alpha = (int) (Math.random() * 255);
						}
						int w0 = 0;
						if (fileContentCount < fileContent.length) {
							w0 = fileContent[fileContentCount] ;
							fileContentCount++;
						} else {
							w0 = (int) (Math.random() * 255);
						}

						int w1 = 0;
						if (fileContentCount < fileContent.length) {
							w1 = fileContent[fileContentCount] ;
							fileContentCount++;
						} else {
							w1 = (int) (Math.random() * 255);
						}
						int w2 = 0;
						if (fileContentCount < fileContent.length) {
							w2 = fileContent[fileContentCount] ;
							fileContentCount++;
						} else {
							w2 = (int) (Math.random() * 255);
						}
						vector tempVec0 = new vector(0, 0, 0, red, green, blue, alpha, w0, w1, w2);
						trainingList.add(tempVec0);
					} else {
						int red = (int) (Math.random() * 255);
						int green = (int) (Math.random() * 55);
						int blue = (int) (Math.random() * 55);
						int alpha = (int) (Math.random() * 255);
						int w0 = (int) (Math.random() * 255);

						int w1 = (int) (Math.random() * 255);
						int w2 = (int) (Math.random() * 255);
						vector tempVec0 = new vector(0, 0, 0, red, green, blue, alpha, w0, w1, w2);
						trainingList.add(tempVec0);
					}
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void some_awesome_function_that_is_totaly_finished_and_not_made_up_oh_hey_look_over_there(
			double somefuckingnumberthatisjustfuckingmadeupbyheywhoare_you_what_are_you_doing_arrrrrrrrgh,
			int your_currentweighttimeforIT_seconds, int your_currentweighttimeforIT_minuts,
			int your_currentweighttimeforIT_hours, int your_currentweighttimeforIT_days,
			int your_currentweighttimeforIT_weeks, int your_currentweighttimeforIT_months,
			int your_currentweighttimeforIT_Years, int your_currentweighttimeforIT_decades,
			int somethingIcallAweekoyear, int s0m3_aBRACOBRDOBRADUBUCIAIcallYestevinsgiving,
			int mytotalbankedXXX_user_ACCESS_RESTRICTED_XXX) {
		// TODO Auto-generated method stub

	}

}

/*
 * HELLO_[...]_WELCOME_TO_THE_DUMP_ = TheHo_[...]_meOfThe_Ot_3ht_mUP_ } else {
 * 
 * some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_woke_up_in_a_video_store_naked_and_alone
 * = 0;
 * some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_do_dumpty_da_dup_dup_duppppppppppreeeeeeeeeeeeeeeeeeeeeeeee_deeeeeeeeeeeeeeeee_oplacodia_a_a_a_a_a_glue
 * = 1;
 * 
 * ArrayList<vector> sdcsdsd = new ArrayList<vector>();
 * 
 * SOMAction trainSOM = new SOMAction(learningFactor, widthOfNeighborhood);
 * 
 * generateTrainingVectors(akojdghahglakjgh, width, height);
 * 
 * JFrame frame = new JFrame("FrameDemo");
 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * 
 * JPanel pane3 = new JPanel(); // use default FlowLayout pane3.setBorderprivate
 * static void
 * runsimulationinLOGGINGMODEbutLoggingGoyUpgRad3d_sooooooo_youzzzz_out(int
 * count) {
 * 
 * LOGGING.
 * println("Welcome To the Simulation With Logging Turned ALL The Way Up ");
 * LOGGING.println("below is output for the most recent run of the program ");
 * 
 * while (count < SOMSIMMULATIONUCOUNTUPPERLIMIT) { LOGGING.print("Iteration: "
 * + count); txtrCurrentItterationOfSim.setText("the Current Iteration: " +
 * SOMSIMMULATIONUCOUNTUPPERLIMIT);
 * 
 * for (int i = 0; i < height; i++) { for (int j = 0; j < width; j++) {
 * 
 * NuronMetaStructure nuronN = neighborhoodList.get(j + (i * height));
 * NuronMetaStructure nuronG = ghettoList.get(j + (i * height)); //
 * NuronMetaStructure nuronC = gatedCommunityList.get(j + (i // * height));
 * 
 * int wN = (int) (nuronN.getVectorOfNuron().wdimension); int w1N = (int)
 * (nuronN.getVectorOfNuron().w1dimension); int w2N = (int)
 * (nuronN.getVectorOfNuron().w2dimension);
 * 
 * int wG = (int) (nuronG.getVectorOfNuron().wdimension); int w1G = (int)
 * (nuronG.getVectorOfNuron().w1dimension); int w2G = (int)
 * (nuronG.getVectorOfNuron().w2dimension);
 * 
 * // int wC = (int) (nuronC.getVectorOfNuron().wdimension); // int w1C = (int)
 * (nuronC.getVectorOfNuron().w1dimension); // int w2C = (int)
 * (nuronC.getVectorOfNuron().w2dimension);
 * 
 * if (wG > 250) { wG = 250; } if (wG < 0) { wG = 0; } if (w1G > 250) { w1G =
 * 250; } if (w1G < 0) { w1G = 0; } if (w2G > 250) { w2G = 250; } if (w2G < 0) {
 * w2G = 0; }
 * 
 * if (wN > 250) { wN = 250; } if (wN < 0) { wN = 0; } if (w1N > 250) { w1N =
 * 250; } if (w1N < 0) { w1N = 0; } if (w2N > 250) { w2N = 250; } if (w2N < 0) {
 * w2N = 0; } // if (wC > 250) { // wC = 250; // } // if (wC < 0) { // wC = 0;
 * // } // if (w1C > 250) { // w1C = 250; // } // if (w1C < 0) { // w1C = 0; //
 * } // if (w2C > 250) { // w2C = 250; // } // if (w2C < 0) { // w2C = 0; // }
 * 
 * Color SOMCOLOR = new Color(wN, w1N, w2N); Color SOMGHETTOCOLOR = new
 * Color(wG, w1G, w2G); // Color SOMGATEDCOMMUNITY = new Color(wC, w1C, w2C);
 * 
 * LOGGING.print("vector vec_at_height_" + i + "_width_" + j +
 * " = new vector(0,0,0,SOMCOLOR_RGB(" + wN + "," + w1N + "," + w2N + "),");
 * LOGGING.print("SOMGHETTOCOLOR_RGB(" + wG + "," + w1G + "," + w2G + "),");
 * LOGGING.println("SOMGATEDCOMMUNITY_RGB(" + 0 + "," + 0 + "," + 0 + "),0);");
 * // LOGGING.println("SOMGATEDCOMMUNITY_RGB(" + wC + "," + // w1C + "," + w2C +
 * "),0);");
 * 
 * PANE_ONE_CHANNEL.setColor(SOMCOLOR);
 * PANE_TWO_CHANNEL.setColor(SOMGHETTOCOLOR); //
 * PANE_THREE_CHANNEL.setColor(SOMGATEDCOMMUNITY);
 * 
 * PANE_ONE_CHANNEL.drawRect(i, j, 1, 1); PANE_TWO_CHANNEL.drawRect(i, j, 1, 1);
 * // PANE_THREE_CHANNEL.drawRect(i, j, 1, 1); } }
 * frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0.pack();
 * frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0.setVisible(true);
 * frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0.repaint(); private static
 * void
 * shit_was_logging_turned_on_or_off_IM_BETTING_OFFshitImadeWhileIwasTHINKINGabouTLOGGING
 * () throws IOException {
 * 
 * 
 * some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_woke_up_in_a_video_store_naked_and_alone
 * = 0;
 * some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_do_dumpty_da_dup_dup_duppppppppppreeeeeeeeeeeeeeeeeeeeeeeee_deeeeeeeeeeeeeeeee_oplacodia_a_a_a_a_a_glue
 * = 1;
 * 
 * ArrayList<vector> scriptipedio = new ArrayList<vector>();
 * 
 * trainSOM = new SOMAction(learningFactorFOrWhEnY0uW4NtLOGGING,
 * widthOfNeighborhoodWithLoggingTurnedON);
 * 
 * generateTrainingVectors(sdcsdsd, width, height);
 * 
 * frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0 = new
 * JFrame("FrameDemo");
 * frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0.setDefaultCloseOperation(
 * JFrame.EXIT_ON_CLOSE);
 * 
 * pane3ThiSis____AHhHhahahaDESIGNeL3ment_and_it_ispane3 = new JPanel(); // use
 * // default // FlowLayout
 * pane3ThiSis____AHhHhahahaDESIGNeL3ment_and_it_ispane3
 * .setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
 * 
 * pane2ThiSis____AHellohowareyathisis_a_whahooooooo_and_it_is_pane2 = new
 * JPanel(); // use // default // FlowLayout
 * pane2ThiSis____AHellohowareyathisis_a_whahooooooo_and_it_is_pane2
 * .setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
 * 
 * pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1 = new
 * JPanel(); // use // default // FlowLayout
 * pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1
 * .setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
 * pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1
 * .setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
 * 
 * infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
 * = new Panel();
 * pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1.add(
 * infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
 * );
 * infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
 * .setLayout(new GridLayout(7, 1, 0, 0));
 * 
 * tabbedPaneThiSis____thisdisplays_inaTUBULARtabformationthisiswhereeachCHANNELisADDED
 * = new JTabbedPane( JTabbedPane.TOP);
 * tabbedPaneThiSis____thisdisplays_inaTUBULARtabformationthisiswhereeachCHANNELisADDED
 * .addTab("SOM Basics", null,
 * pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1, null);
 * tabbedPaneThiSis____thisdisplays_inaTUBULARtabformationthisiswhereeachCHANNELisADDED
 * .addTab("SOM varient 0", null,
 * pane2ThiSis____AHellohowareyathisis_a_whahooooooo_and_it_is_pane2, null);
 * tabbedPaneThiSis____thisdisplays_inaTUBULARtabformationthisiswhereeachCHANNELisADDED
 * .addTab("SOM varient 1", null,
 * pane3ThiSis____AHhHhahahaDESIGNeL3ment_and_it_ispane3, null);
 * 
 * final JFileChooser fc = new JFileChooser();
 * 
 * loggingPicture = new JTextArea();
 * 
 * loggingPicture .setText(
 * nice_picture_to_show_when_you_have_decided_to_log_absolutePath_where_logging_is_enabled
 * );
 * infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
 * .add(loggingPicture);
 * 
 * frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0.getContentPane().add(
 * tabbedPaneThiSis____thisdisplays_inaTUBULARtabformationthisiswhereeachCHANNELisADDED,
 * BorderLayout.NORTH);
 * 
 * btnFileChooser = new JButton("file");
 * infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
 * .add(btnFileChooser); btnFileChooser.addActionListener(new ActionListener() {
 * 
 * @Override public void actionPerformed(ActionEvent e) {
 * 
 * fc.showOpenDialog(frameThiSis____AHHHHHDesiGnEl3ment_and_it_is_frame0);
 * nicePictureToShowWhenNotLogging = fc.getSelectedFile().getAbsolutePath();
 * loggingPicture.setText(nicePictureToShowWhenNotLogging); BufferedImage img =
 * null; try { img = ImageIO.read(new File(nicePictureToShowWhenNotLogging)); }
 * catch (IOException e1) { } ImageIcon image = new ImageIcon(img); JLabel
 * imageForSeed = new JLabel(image); Component[] components =
 * pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1
 * .getComponents();
 * 
 * for (int i = 0; i < components.length; i++) { if (components[i] instanceof
 * JLabel) { components[i] = imageForSeed; } } ;
 * 
 * } });
 * 
 * txtrCurrentItterationOfSim = new JTextArea();
 * 
 * txtrCurrentItterationOfSim.setText("the Current Iteration: -1");
 * infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
 * .add(txtrCurrentItterationOfSim); txtrHeight = new JTextArea();
 * txtrHeight.setText("height: " + height);
 * infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
 * .add(txtrHeight); txtrWidth = new JTextArea(); txtrWidth.setText("width: " +
 * width);
 * infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
 * .add(txtrWidth); neighborhoodtext = new JTextArea();
 * infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
 * .add(neighborhoodtext); neighborhoodtext.setText("Neighborhood width: " +
 * widthOfNeighborhoodWithLoggingTurnedON); LearningFactorText = new
 * JTextArea();
 * infogroupThiSis____ohhhhohhhhhohhhhhThisIsTHeInfoGroupPanelThatDisplaysStatsAboutRunningScenario
 * .add(LearningFactorText); LearningFactorText.setText("Learning Factor: " +
 * learningFactorFOrWhEnY0uW4NtLOGGING);
 * 
 * img = ImageIO.read(new File(nicePictureToShowWhenNotLogging)); image = new
 * ImageIcon(img);
 * 
 * imageForSeed = new JLabel(image);
 * imageForSeed.setHorizontalAlignment(SwingConstants.TRAILING);
 * 
 * img2 = ImageIO.read(new File(nicePictureToShowWhenNotLogging)); image2 = new
 * ImageIcon(img2);
 * 
 * imageForSeed2 = new JLabel(image2);
 * 
 * img3 = ImageIO.read(new File(nicePictureToShowWhenNotLogging)); image3 = new
 * ImageIcon(img3);
 * 
 * imageForSeed3 = new JLabel(image3);
 * 
 * pane1ThiSis____ElloGObunerGOVENERGoVERMERmeRmErRrrRr_and_it_is_pane1.add(
 * imageForSeed);
 * pane2ThiSis____AHellohowareyathisis_a_whahooooooo_and_it_is_pane2.add(
 * imageForSeed2);
 * pane3ThiSis____AHhHhahahaDESIGNeL3ment_and_it_ispane3.add(imageForSeed3);
 * 
 * PANE_ONE_CHANNEL = img.createGraphics(); PANE_TWO_CHANNEL =
 * img2.createGraphics(); PANE_THREE_CHANNEL = img3.createGraphics();
 * neighborhoodList = trainSOM.nP.getNuronList(); ghettoList =
 * trainSOM.gP.getNuronList(); // gatedCommunityList =
 * trainSOM.gCP.getNuronList(); }
 * 
 * if (LOGGING == LOGGINGLEVEL.LIKEBASICALLYLOGEVEREYCHANGE) {
 * 
 * LOGGING.println("thisWasGivvingErrorIGuess: " + count); //
 * trainSOM.train(sdcsdsd.get(count).getVectorOfNuron(), //
 * some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_woke_up_in_a_video_store_naked_and_alone
 * );
 * 
 * } else { trainSOM.train_notepad(trainingList.get(count).getVectorOfNuron(),
 * some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_do_dumpty_da_dup_dup_duppppppppppreeeeeeeeeeeeeeeeeeeeeeeee_deeeeeeeeeeeeeeeee_oplacodia_a_a_a_a_a_glue
 * ); } count++; } PANE_ONE_CHANNEL.dispose(); PANE_TWO_CHANNEL.dispose();
 * PANE_THREE_CHANNEL.dispose(); trainSOM.dispose();
 * CURRENTVIEWOFACTIVENETWORK++; } (BorderFactory.createEmptyBorder(5, 5, 5,
 * 5));
 * 
 * JPanel pane2 = new JPanel(); // use default FlowLayout
 * pane2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
 * 
 * JPanel pane1 = new JPanel(); // use default FlowLayout
 * pane1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
 * pane1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
 * 
 * Panel infogroup = new Panel(); pane1.add(infogroup); infogroup.setLayout(new
 * GridLayout(7, 1, 0, 0));
 * 
 * JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
 * tabbedPane.addTab("SOM Basics", null, pane1, null);
 * tabbedPane.addTab("SOM varient 0", null, pane2, null);
 * tabbedPane.addTab("SOM varient 1", null, pane3, null);
 * 
 * final JFileChooser fc = new JFileChooser();
 * 
 * JTextArea filename = new JTextArea();
 * 
 * filename.setText(nicePictureToShowWhenNotLogging); infogroup.add(filename);
 * 
 * frame.getContentPane().add(tabbedPane, BorderLayout.NORTH);
 * 
 * JButton btnFileChooser = new JButton("file"); infogroup.add(btnFileChooser);
 * btnFileChooser.addActionListener(new ActionListener() {
 * 
 * @Override public void actionPerformed(ActionEvent e) {
 * 
 * fc.showOpenDialog(frame); nicePictureToShowWhenNotLogging =
 * fc.getSelectedFile().getAbsolutePath();
 * filename.setText(nicePictureToShowWhenNotLogging); BufferedImage img = null;
 * try { img = ImageIO.read(new File(nicePictureToShowWhenNotLogging)); } catch
 * (IOException e1) { } ImageIcon image = new ImageIcon(img); JLabel
 * imageForSeed = new JLabel(image); Component[] components =
 * pane1.getComponents();
 * 
 * for (int i = 0; i < components.length; i++) { if (components[i] instanceof
 * JLabel) { components[i] = imageForSeed; } } ;
 * 
 * } });
 * 
 * JTextArea txtrThisIsNeat = new JTextArea();
 * 
 * txtrThisIsNeat.setText("this is neat"); infogroup.add(txtrThisIsNeat);
 * JTextArea txtrHeight = new JTextArea(); txtrHeight.setText("height: " +
 * height); infogroup.add(txtrHeight); JTextArea txtrWidth = new JTextArea();
 * txtrWidth.setText("width: " + width); infogroup.add(txtrWidth); JTextArea
 * neighborhoodtext = new JTextArea(); infogroup.add(neighborhoodtext);
 * neighborhoodtext.setText("Neighborhood width: " + widthOfNeighborhood);
 * JTextArea LearningFactorText = new JTextArea();
 * infogroup.add(LearningFactorText);
 * LearningFactorText.setText("Learning Factor: " + learningFactor);
 * 
 * BufferedImage img = ImageIO.read(new File(nicePictureToShowWhenNotLogging));
 * ImageIcon image = new ImageIcon(img);
 * 
 * JLabel imageForSeed = new JLabel(image);
 * imageForSeed.setHorizontalAlignment(SwingConstants.TRAILING);
 * 
 * BufferedImage img2 = ImageIO.read(new File(nicePictureToShowWhenNotLogging));
 * ImageIcon image2 = new ImageIcon(img2);
 * 
 * JLabel imageForSeed2 = new JLabel(image2);
 * 
 * BufferedImage img3 = ImageIO.read(new File(nicePictureToShowWhenNotLogging));
 * ImageIcon image3 = new ImageIcon(img3);
 * 
 * JLabel imageForSeed3 = new JLabel(image3);
 * 
 * pane1.add(imageForSeed); pane2.add(imageForSeed2); pane3.add(imageForSeed3);
 * 
 * PANE_ONE_CHANNEL = img.createGraphics(); PANE_TWO_CHANNEL =
 * img2.createGraphics(); PANE_THREE_CHANNEL = img3.createGraphics();
 * neighborhoodList = trainSOM.nP.getNuronList(); ghettoList =
 * trainSOM.gP.getNuronList(); // gatedCommunityList =
 * trainSOM.gCP.getNuronList(); }
 */
