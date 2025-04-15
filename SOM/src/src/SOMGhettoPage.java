package src;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SOMGhettoPage extends WhistlesRibbionsSpinnersAnd implements NuralStructures {

	private double width;
	private double height;
	ArrayList<NuronMetaStructure> ghettoNuronList = new ArrayList<NuronMetaStructure>();
	ArrayList<Double> neighborhoodFactor = new ArrayList<Double>();
	ArrayList<vector> changeInRefrenceVector = new ArrayList<vector>();

	NuronMetaStructure winningNode = null;
	double widthOfNeighborhood = 5;
	double learningFactor = 10;
	double ghettoThreshold = .51;


	SOMGhettoPage(int w, int h) {
		width = w;
		height = h;
		// 1024x1024 = 1,048,576

		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				vector microDOTSPrimaryMission = new vector(i, j, 0.0, Math.random() * 256.0, Math.random() * 256.0,
						Math.random() * 256.0, 0.0);
				NuronMetaStructure microDOT = new nuron(microDOTSPrimaryMission);
				ghettoNuronList.add(microDOT);
				neighborhoodFactor.add(0.0);
				changeInRefrenceVector.add(new vector(0, 0, 0, 0, 0, 0, 0));
			}
		}

	}

	@Override
	public ArrayList<NuronMetaStructure> getNuronList() {
		return ghettoNuronList;
	}

	@Override
	public void calculateWinningNode(vector inputToSOMVec,double some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_polly_wolly_wiggle_bitty_inky_blinky_bitybitty_ballllllller_shotCaller_wriggity_wriggity_roller_bowler_fortunate_lover_shot_gun_controller) {
		NuronMetaStructure largest = null;
		double largestDotProuduct = 0.0;

		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				double testDot = ghettoNuronList.get((int) (i + (j * height))).testDot(inputToSOMVec);

				if (testDot > largestDotProuduct) {
					largestDotProuduct = testDot;
					largest = ghettoNuronList.get((int) (i + (j * height)));
				}
			}
		}
		if (largest != null) {
			winningNode = largest;
		}

	}

	public void changeRefrenceVectorByCalCulatedAmount(vector inputvector) {

		CalculateChangeInRefrenceVector(inputvector);

		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {

				vector changeInRefVec = changeInRefrenceVector.get((int) (i + (j * height)));
				NuronMetaStructure nuron = ghettoNuronList.get((int) (i + (j * height)));
				nuron.adjustVector(changeInRefVec);

			}
		}

	}

	private void CalculateChangeInRefrenceVector(vector inputvector) {

		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				NuronMetaStructure r_i = ghettoNuronList.get((int) (i + (j * height)));
				ArrayList<NuronMetaStructure> ghetto = collectGhetto(j, i, null);

				double Aw = 0.0, Aw1 = 0.0, Aw2 = 0.0;
				double temp1 = 0.0, temp2 = 0.0, temp3 = 0.0;

				for (NuronMetaStructure n : ghetto) {
					temp1 = (n.getVectorOfNuron().dimensions[3] - r_i.getVectorOfNuron().dimensions[4])
							/ n.getVectorOfNuron().dimensions[3];
					temp2 = (n.getVectorOfNuron().dimensions[3] - r_i.getVectorOfNuron().dimensions[4])
							/ n.getVectorOfNuron().dimensions[3];
					temp3 = (n.getVectorOfNuron().dimensions[3] - r_i.getVectorOfNuron().dimensions[4])
							/ n.getVectorOfNuron().dimensions[3];
					if (temp1 > ghettoThreshold) {
						Aw += 1;
					}

					if (temp2 > ghettoThreshold) {
						Aw1 += 1;
					}

					if (temp3 > ghettoThreshold) {
						Aw2 += 1;
					}
				}

				vector temp = new vector(0, 0, 0, Aw / ghetto.size(), Aw1 / ghetto.size(), Aw2 / ghetto.size(), 0);

				double neighborhoodMembership = temp.Dot(new vector(0, 0, 0, 1, 1, 1, 0));
				neighborhoodFactor.set((int) (i + (j * height)), neighborhoodMembership);

				double w_0 = 0;
				double w_1 = 0;
				double w_2 = 0;

				for (NuronMetaStructure nuron : ghetto) {
					w_0 += nuron.getVectorOfNuron().dimensions[3] - r_i.getVectorOfNuron().dimensions[3];
					w_1 += nuron.getVectorOfNuron().dimensions[4] - r_i.getVectorOfNuron().dimensions[4];
					w_2 += nuron.getVectorOfNuron().dimensions[5] - r_i.getVectorOfNuron().dimensions[5];

				}

				vector vecSubtract = new vector(i, j, 0, w_0 / ghetto.size(), w_1 / ghetto.size(), w_2 / ghetto.size(),
						0);

				double learningFactorAndNeighborhoodMembership = learningFactor * neighborhoodMembership;

				vector changeInRefrenceVec = new vector(0, 0, 0,
						vecSubtract.dimensions[3] * learningFactorAndNeighborhoodMembership,
						vecSubtract.dimensions[4] * learningFactorAndNeighborhoodMembership,
						vecSubtract.dimensions[5] * learningFactorAndNeighborhoodMembership, 0);

				changeInRefrenceVector.set((int) (i + (j * height)), changeInRefrenceVec);
			}

		}

		// PrintWriter out1;
		// try {
		// out1 = new PrintWriter(new
		// FileWriter("C:\\Users\\BitBot01\\workspace\\BasicSOM\\resources\\ghettoStartup.txt"));
		//
		// for (int j = 0; j < 1024; j++) {
		// for (int i = 0; i < 1024; i++) {
		// NuronMetaStructure n = ghettoNuronList.get((int) (i + (j * 1024)));
		//
		//
		// out1.print("n:"+n.vectorOfNuron.wdimension+","+n.vectorOfNuron.w1dimension+","+n.vectorOfNuron.w2dimension+"
		// ");
		// }
		// out1.println(" ");
		// }
		// out1.close();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		//

	}

	private ArrayList<NuronMetaStructure> collectGhetto(int j, int i, PrintWriter out) {

		ArrayList<NuronMetaStructure> temp = new ArrayList<NuronMetaStructure>();

		NuronMetaStructure a_0 = null;
		NuronMetaStructure a_1 = null;
		NuronMetaStructure a_2 = null;
		NuronMetaStructure a_3 = null;
		NuronMetaStructure a_4 = null;
		NuronMetaStructure a_5 = null;
		NuronMetaStructure a_6 = null;
		NuronMetaStructure a_7 = null;
		// check bounds
		if (j == 0 && i == 0) {
			a_4 = ghettoNuronList.get((int) ((i + 1) + (j * height)));
			a_5 = ghettoNuronList.get((int) ((i + 1) + ((j * height) + 1)));
			a_6 = ghettoNuronList.get((int) (i + ((j * height) + 1)));
		} else if (j == height - 1 && i == width - 1) {
			a_0 = ghettoNuronList.get((int) ((i - 1) + (j * height)));
			a_1 = ghettoNuronList.get((int) ((i - 1) + ((j * height) - 1)));
			a_2 = ghettoNuronList.get((int) (i + ((j * height) - 1)));
		} else if (j == height - 1 && i == 0) {
			a_2 = ghettoNuronList.get((int) (i + ((j * height) - 1)));
			a_3 = ghettoNuronList.get((int) ((i + 1) + ((j * height) - 1)));
			a_4 = ghettoNuronList.get((int) ((i + 1) + (j * height)));
		} else if (j == 0 && i == width - 1) {
			a_0 = ghettoNuronList.get((int) ((i - 1) + (j * height)));
			a_6 = ghettoNuronList.get((int) (i + ((j * height) + 1)));
			a_7 = ghettoNuronList.get((int) ((i - 1) + ((j * height) + 1)));
		} else if (j == 0) {
			a_0 = ghettoNuronList.get((int) ((i - 1) + (j * height)));
			a_4 = ghettoNuronList.get((int) ((i + 1) + (j * height)));
			a_5 = ghettoNuronList.get((int) ((i + 1) + ((j * height) + 1)));
			a_6 = ghettoNuronList.get((int) (i + ((j * height) + 1)));
			a_7 = ghettoNuronList.get((int) ((i - 1) + ((j * height) + 1)));
		} else if (j == height - 1) {
			a_0 = ghettoNuronList.get((int) ((i - 1) + (j * height)));
			a_1 = ghettoNuronList.get((int) ((i - 1) + ((j * height) - 1)));
			a_2 = ghettoNuronList.get((int) (i + ((j * height) - 1)));
			a_3 = ghettoNuronList.get((int) ((i + 1) + ((j * height) - 1)));
			a_4 = ghettoNuronList.get((int) ((i + 1) + (j * height)));
		} else if (i == 0) {
			a_2 = ghettoNuronList.get((int) (i + (j * height) - 1));
			a_3 = ghettoNuronList.get((int) ((i + 1) + ((j * height) - 1)));
			a_4 = ghettoNuronList.get((int) ((i + 1) + (j * height)));
			a_5 = ghettoNuronList.get((int) ((i + 1) + ((j * height) + 1)));
			a_6 = ghettoNuronList.get((int) (i + ((j * height) + 1)));
		} else if (i == width - 1) {
			a_6 = ghettoNuronList.get((int) (i + ((j * height) + 1)));
			a_7 = ghettoNuronList.get((int) ((i - 1) + ((j * height) + 1)));
			a_0 = ghettoNuronList.get((int) ((i - 1) + (j * height)));
			a_1 = ghettoNuronList.get((int) ((i - 1) + ((j * height) - 1)));
			a_2 = ghettoNuronList.get((int) (i + ((j * height) - 1)));

		} else {
			a_0 = ghettoNuronList.get((int) ((i - 1) + (j * height)));
			a_1 = ghettoNuronList.get((int) ((i - 1) + ((j * height) - 1)));
			a_2 = ghettoNuronList.get((int) (i + ((j * height) - 1)));
			a_3 = ghettoNuronList.get((int) ((i + 1) + ((j * height) - 1)));
			a_4 = ghettoNuronList.get((int) ((i + 1) + (j * height)));
			a_5 = ghettoNuronList.get((int) ((i + 1) + ((j * height) + 1)));
			a_6 = ghettoNuronList.get((int) (i + ((j * height) + 1)));
			a_7 = ghettoNuronList.get((int) ((i - 1) + ((j * height) + 1)));

		}

		if (a_0 != null)
			temp.add(a_0);
		if (a_1 != null)
			temp.add(a_1);
		if (a_2 != null)
			temp.add(a_2);
		if (a_3 != null)
			temp.add(a_3);
		if (a_4 != null)
			temp.add(a_4);
		if (a_5 != null)
			temp.add(a_5);
		if (a_6 != null)
			temp.add(a_6);
		if (a_7 != null)
			temp.add(a_7);

		return temp;

	}



	@Override
	public void changeRefrenceVectorByCalculatedAmount(vector inputvector,
			double some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed) {
		changeRefrenceVectorByCalCulatedAmount(inputvector);
		
	}

	@Override
	public void notepad_for_XXX_testing_delta_r_i(vector inputvector,
			double some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_umm_how_doses_this_ohhhhhello_why_look_here_now_hi_how_ya_dooing_boop) {
		changeRefrenceVectorByCalCulatedAmount(inputvector);
		
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

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}




}
