package src;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SOMGatedCommunityPage extends WhistlesRibbionsSpinnersAnd implements NuralStructures{

	private double width;
	private double height;
	ArrayList<NuronMetaStructure> ghettoNuronList = new ArrayList<NuronMetaStructure>();
	ArrayList<Double> neighborhoodFactor = new ArrayList<Double>();
	ArrayList<vector> changeInRefrenceVector = new ArrayList<vector>();

	NuronMetaStructure winningNode = null;
	double widthOfNeighborhood = 5;
	double learningFactor = 10;
	double ghettoThreshold = .51;

	private int depth;
	private int winningNodeLength;

	SOMGatedCommunityPage(int w, int h) {
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
	public void calculateWinningNode(vector inputToSOMVec,double some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_so_lets_make_one_up_shall_we_firstly_lets_introduce_each_other_to_the_coolest_emotion_that_you_have_ever_experienced_only_there_should_read_howdy_dablah_do_dee_da_polly_wolly_wiggle_bitty_inky_blinky_bitybitty) {
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

	private ArrayList<NuronMetaStructure> findLongestContiguiousListOfNurons(NuronMetaStructure winner) {
		return A1(winner, new nullNuron());

	}

	private ArrayList<NuronMetaStructure> A1(NuronMetaStructure cN, NuronMetaStructure pN) {
		ArrayList<NuronMetaStructure> cNbrs = get_Neighbors(cN);
		ArrayList<NuronMetaStructure> pNbrs = get_Neighbors(pN);
		ArrayList<NuronMetaStructure> good = new ArrayList<NuronMetaStructure>();
		good = B(cN, cNbrs);
		remove_pN_pNbrs_from_good(pN, pNbrs, good);

		if (good.size() == 1) {

			if (good.get(0).typeOfNuron() == NuralType.NULLNURON) {
				ArrayList<NuronMetaStructure> lastNode = new ArrayList<NuronMetaStructure>();
				lastNode.add(cN);
				LOG.print("good==1: ");
				LOG.print("isNull: " + good.get(0).typeOfNuron().equals(NuralType.NULLNURON) + " ");
				return lastNode;
			} else {
				ArrayList<NuronMetaStructure> error = new ArrayList<NuronMetaStructure>();
				error.add(new nullNuron());
				LOG.print("error1 ");
				return error;
			}
		} else if (good.size() > 1) {
			int i = 0;
			ArrayList<ArrayList<NuronMetaStructure>> count = new ArrayList<ArrayList<NuronMetaStructure>>();
			for (NuronMetaStructure q : good) {
				count.add(new ArrayList<NuronMetaStructure>());
			}
			for (NuronMetaStructure q : good) {
				count.get(i).add(q);
				count.get(i).addAll(A1(q, cN));
				i++;
			}
			ArrayList<NuronMetaStructure> longest_list = longest_list(count);
			LOG.print("good>1: " + longest_list.size() + " ");
			return longest_list;
		} else {
			ArrayList<NuronMetaStructure> error = new ArrayList<NuronMetaStructure>();
			error.add(new nullNuron());
			LOG.print("error2 ");
			return error;
		}
	}

	private ArrayList<NuronMetaStructure> longest_list(ArrayList<ArrayList<NuronMetaStructure>> count) {
		ArrayList<NuronMetaStructure> longestPath = new ArrayList<NuronMetaStructure>();
		for (ArrayList<NuronMetaStructure> path : count) {
			if (path.size() > longestPath.size())
				longestPath = path;
		}
		return longestPath;
	}

	private int longest_count(int[] count) {
		if (count.length > 0) {
			int longest = count[0];
			for (int a = 1; a < count.length; a++) {
				if (count[a] > longest)
					longest = count[a];
			}
			return longest;
		} else
			return 0;

	}

	private void remove_pN_pNbrs_from_good(NuronMetaStructure pN, ArrayList<NuronMetaStructure> pNbrs,
			ArrayList<NuronMetaStructure> good) {
		if (good.contains(pN))
			good.remove(pN);
		for (NuronMetaStructure nuron : pNbrs) {
			if (good.contains(nuron))
				good.remove(nuron);
		}

	}

	private ArrayList<NuronMetaStructure> B(NuronMetaStructure cN, ArrayList<NuronMetaStructure> cNbrs) {
		ArrayList<NuronMetaStructure> good = new ArrayList<NuronMetaStructure>();

		if (cNbrs.size() == 0) {
			good.add(new nullNuron());
			return good;
		} else {

			double numeritor = cNbrs.get(0).getVectorOfNuron().Subtract(cN.getVectorOfNuron())
					.Dot(new vector(0, 0, 0, 1, 1, 1, 0));
			double denominator = cNbrs.get(0).getVectorOfNuron().Dot(new vector(0, 0, 0, 1, 1, 1, 0));
			double withinTollerence = numeritor / denominator;

			if (withinTollerence <= ghettoThreshold) {
				NuronMetaStructure goodNode = cNbrs.get(0);
				cNbrs.remove(0);
				good.add(goodNode);
				good.addAll(B(cN, cNbrs));
				return good;
			} else {
				cNbrs.remove(0);
				return B(cN, cNbrs);
			}
		}
	}

	private ArrayList<NuronMetaStructure> get_Neighbors(NuronMetaStructure q) {
		int i = (int) q.getVectorOfNuron().dimensions[0];
		int j = (int) q.getVectorOfNuron().dimensions[1];
		int k = (int) q.getVectorOfNuron().dimensions[2];

		ArrayList<NuronMetaStructure> saveList = new ArrayList<NuronMetaStructure>();

		if (j == 0 && i == 0) {
			saveList.add(ghettoNuronList.get((int) ((i + 1) + (j * height))));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + ((j * height) + 1))));
			saveList.add(ghettoNuronList.get((int) (i + ((j * height) + 1))));
		} else if (j == height - 1 && i == width - 1) {
			saveList.add(ghettoNuronList.get((int) ((i - 1) + (j * height))));
			saveList.add(ghettoNuronList.get((int) ((i - 1) + ((j * height) - 1))));
			saveList.add(ghettoNuronList.get((int) (i + ((j * height) - 1))));
		} else if (j == height - 1 && i == 0) {
			saveList.add(ghettoNuronList.get((int) (i + ((j * height) - 1))));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + ((j * height) - 1))));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + (j * height))));
		} else if (j == 0 && i == width - 1) {
			saveList.add(ghettoNuronList.get((int) ((i - 1) + (j * height))));
			saveList.add(ghettoNuronList.get((int) (i + ((j * height) + 1))));
			saveList.add(ghettoNuronList.get((int) ((i - 1) + ((j * height) + 1))));
		} else if (j == 0) {
			saveList.add(ghettoNuronList.get((int) ((i - 1) + (j * height))));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + (j * height))));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + ((j * height) + 1))));
			saveList.add(ghettoNuronList.get((int) (i + ((j * height) + 1))));
			saveList.add(ghettoNuronList.get((int) ((i - 1) + ((j * height) + 1))));
		} else if (j == height - 1) {
			saveList.add(ghettoNuronList.get((int) ((i - 1) + (j * height))));
			saveList.add(ghettoNuronList.get((int) ((i - 1) + ((j * height) - 1))));
			saveList.add(ghettoNuronList.get((int) (i + ((j * height) - 1))));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + ((j * height) - 1))));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + (j * height))));
		} else if (i == 0) {
			saveList.add(ghettoNuronList.get((int) (i + (j * height) - 1)));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + ((j * height) - 1))));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + (j * height))));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + ((j * height) + 1))));
			saveList.add(ghettoNuronList.get((int) (i + ((j * height) + 1))));
		} else if (i == width - 1) {
			saveList.add(ghettoNuronList.get((int) (i + ((j * height) + 1))));
			saveList.add(ghettoNuronList.get((int) ((i - 1) + ((j * height) + 1))));
			saveList.add(ghettoNuronList.get((int) ((i - 1) + (j * height))));
			saveList.add(ghettoNuronList.get((int) ((i - 1) + ((j * height) - 1))));
			saveList.add(ghettoNuronList.get((int) (i + ((j * height) - 1))));

		} else {
			saveList.add(ghettoNuronList.get((int) ((i - 1) + (j * height))));
			saveList.add(ghettoNuronList.get((int) ((i - 1) + ((j * height) - 1))));
			saveList.add(ghettoNuronList.get((int) (i + ((j * height) - 1))));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + ((j * height) - 1))));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + (j * height))));
			saveList.add(ghettoNuronList.get((int) ((i + 1) + ((j * height) + 1))));
			saveList.add(ghettoNuronList.get((int) (i + ((j * height) + 1))));
			saveList.add(ghettoNuronList.get((int) ((i - 1) + ((j * height) + 1))));

		}

		return saveList;
	}

	private vector getVectorSumOfLongestContiguios(ArrayList<NuronMetaStructure> longestContiguiousCount) {

		vector saveVector = new vector(0, 0, 0, 0, 0, 0, 0);
		for (NuronMetaStructure nuron : longestContiguiousCount) {
			saveVector.dimensions[3] += nuron.getVectorOfNuron().dimensions[3];
			saveVector.dimensions[4] += nuron.getVectorOfNuron().dimensions[4];
			saveVector.dimensions[5] += nuron.getVectorOfNuron().dimensions[5];
		}
		return saveVector;
	}

	private void CalculateChangeInRefrenceVector(vector inputvector) {

		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				NuronMetaStructure r_i = ghettoNuronList.get((int) (i + (j * height)));
				ArrayList<NuronMetaStructure> ghetto = get_Neighbors(r_i);
				ArrayList<NuronMetaStructure> longest = findLongestContiguiousListOfNurons(r_i);

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
			LOG.println("");
		}

	}


	

	@Override
	public void changeRefrenceVectorByCalculatedAmount(vector inputvector,
			double some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_blah_blah_blahhhhahahahahahahahahahsshhshshshshster_beep_boink) {
		CalculateChangeInRefrenceVector(inputvector);

		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {

				vector changeInRefVec = changeInRefrenceVector.get((int) (i + (j * height)));
				NuronMetaStructure nuron = ghettoNuronList.get((int) (i + (j * height)));
				nuron.adjustVector(changeInRefVec);

			}
		}
	}

	
	@Override
	public void notepad_for_XXX_testing_delta_r_i(vector inputvector,
			double some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_umm_how_doses_this_ohhhhhello_why_look_here_now_hi_how_ya_dooing_ohh_coooL_s) {
		CalculateChangeInRefrenceVector(inputvector);

		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {

				vector changeInRefVec = changeInRefrenceVector.get((int) (i + (j * height)));
				NuronMetaStructure nuron = ghettoNuronList.get((int) (i + (j * height)));
				nuron.adjustVector(changeInRefVec);

			}
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

	@Override
	public void dispose() {
	}


}
