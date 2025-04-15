package src;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class SOMNeighborhoodPage extends WhistlesRibbionsSpinnersAnd implements NuralStructures {

	private double width;
	private double height;
	ArrayList<NuronMetaStructure> nuronList = new ArrayList<NuronMetaStructure>();
	ArrayList<Double> neighborhoodFactor = new ArrayList<Double>();
	ArrayList<vector> changeInRefrenceVector = new ArrayList<vector>();

	NuronMetaStructure winningNode = null;
	double widthOfNeighborhood = 5;
	double learningFactor = 10;
	private byte[] fileContents;

	SOMNeighborhoodPage(int w, int h) {
		width = w;
		height = h;
		// 1024x1024 = 1,048,576
		File file = new File("/home/wes/git/SOM/SOM/SOM/res/T");
		try {
			fileContents = Files.readAllBytes(file.toPath());
			int fileContentCount = 0;
			for (int j = 0; j < height; j++) {
				for (int i = 0; i < width; i++) {

					int choice = (int) (Math.random() * 13);
					int red = 0;
					int green = 0;
					int blue = 0;
					int increaseby = 1;

					red = (int) (fileContents[fileContentCount] );
					green = (int) (fileContents[fileContentCount + 1] );
					blue = (int) (fileContents[fileContentCount + 2]);
					increaseby = 3;

					vector microDOTSPrimaryMission = new vector(i, j, 0.0, red, green, blue, 0.0);
					fileContentCount = fileContentCount + increaseby;
					NuronMetaStructure microDOT = new nuron(microDOTSPrimaryMission);
					nuronList.add(microDOT);
					neighborhoodFactor.add(0.0);
					changeInRefrenceVector.add(new vector(0, 0, 0, 0, 0, 0, 0));
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<NuronMetaStructure> getNuronList() {
		return nuronList;
	}

	private void calculateChangeInRefrenceVector_neighborhood(vector inputvector) {
		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				NuronMetaStructure n = nuronList.get((int) (i + (j * height)));
				double testDistance = winningNode.testDistance(n.getVectorOfNuron());
				double numirator = Math.pow(testDistance, 2);
				double denominator = Math.pow(widthOfNeighborhood, 2);
				double factor = Math.exp(-(numirator) / (denominator));
				neighborhoodFactor.set((int) (i + (j * height)), factor);

				vector vecSubtract = new vector(i, j, 0, inputvector.dimensions[3] - n.getVectorOfNuron().dimensions[3],
						inputvector.dimensions[4] - n.getVectorOfNuron().dimensions[4]);
				double temp = learningFactor * factor;

				vector changeInRefrenceVec = new vector(0, 0, 0, vecSubtract.dimensions[3] * temp,
						vecSubtract.dimensions[4] * temp,0);

				changeInRefrenceVector.set((int) (i + (j * height)), changeInRefrenceVec);
			}

		}
	}

	public void setWidthOfNeighborhood(double widthOfNeighborhood) {
		this.widthOfNeighborhood = widthOfNeighborhood;
	}

	public void setLearningFactor(double learningFactor) {
		this.learningFactor = learningFactor;
	}

	@Override
	public void changeRefrenceVectorByCalculatedAmount(vector inputvector,
			double some_question_some_person_made_up_once_one_time_supposidaly) {
//		if (Math.floor(Math.random()
//				* some_question_some_person_made_up_once_one_time_supposidaly) > (some_question_some_person_made_up_once_one_time_supposidaly
//						/ 2))
//			LOG.print("Hello ");
//		else
//			LOG.print("Olleh ");
		calculateChangeInRefrenceVector_neighborhood(inputvector);
		int fileContentCount = 0;
		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				vector changeInRefVec = changeInRefrenceVector.get((int) (i + (j * height)));
				NuronMetaStructure nuron = nuronList.get((int) (i + (j * height)));
				
				
				int choice = (int) (Math.random() * 13);
				int red = 0;
				int green = 0;
				int blue = 0;
				int increaseby = 1;

				red = (int) (fileContents[fileContentCount]+100 );
				green = (int) (fileContents[fileContentCount + 1]+100 );
				blue = (int) (fileContents[fileContentCount + 2]+100);
				increaseby = 3;

				
				fileContentCount = fileContentCount + increaseby;
				nuron.adjustVector(new vector(i, j, 0.0, red, green, blue, 0.0));
				System.out.println(changeInRefVec);

			}
		}
//		if (Math.floor(Math.random()
//				* some_question_some_person_made_up_once_one_time_supposidaly) > (some_question_some_person_made_up_once_one_time_supposidaly
//						/ 2))
//			LOG.print("hey how are ya ");
//		else
//			LOG.print("ya are how hey ");
	}

	@Override
	public void notepad_for_XXX_testing_delta_r_i(vector inputvector,
			double some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_umm_how_doses_this_ohhhhhello_why_look_here_now_hi_how_ya_dooing_what_so_ever_are_you_up_to_my_dear_deer_read_ader_arder_ardest_lesast_less_ard_maybe) {
//			if (Math.floor(Math.random()
//					* some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_umm_how_doses_this_ohhhhhello_why_look_here_now_hi_how_ya_dooing_what_so_ever_are_you_up_to_my_dear_deer_read_ader_arder_ardest_lesast_less_ard_maybe) > (some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_umm_how_doses_this_ohhhhhello_why_look_here_now_hi_how_ya_dooing_what_so_ever_are_you_up_to_my_dear_deer_read_ader_arder_ardest_lesast_less_ard_maybe
//							/ 2))
//				LOG.print("Hello ");
//			else
//				LOG.print("Olleh ");
		calculateChangeInRefrenceVector_neighborhood(inputvector);
		int fileContentCount = 0;
		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				int choice = (int) (Math.random() * 13);
				int red = 0;
				int green = 0;
				int blue = 0;
				int increaseby = 1;

				red = (int) (fileContents[fileContentCount]);

				
				fileContentCount = fileContentCount + increaseby;

				vector changeInRefVec = changeInRefrenceVector.get((int) (i + (j * height)));
				NuronMetaStructure nuron = nuronList.get((int) (i + (j * height)));

				changeInRefVec.dimensions[3] = (changeInRefVec.dimensions[3]+red);
				changeInRefVec.dimensions[4] = (changeInRefVec.dimensions[4]+green);
				changeInRefVec.dimensions[5] = (changeInRefVec.dimensions[5]+blue);
				
				
				nuron.adjustVector(changeInRefVec);
//				System.out.println("SEWWES : ("+changeInRefVec.wdimension+","+changeInRefVec.w1dimension+","+changeInRefVec.w2dimension+")");

			}
		}

	}

	@Override
	public void calculateWinningNode(vector inputToSOMVec,
			double some_question_some_person_made_up_once_one_time_supposidaly_that_supposidaly_answers_before_the_supposition_is_even_fully_formed_umm_how_doses_this_ohhhhhello_why_look_here_now_hi_how_ya_dooing_what_so_ever_are_you_up_to_my_dear_deer_read_ader_arder_ardest_lesast_less_ard_maybe_look_what_the_cat_dragged_in_another_soggy_dog_looking_forAbone_to_scrounge) {
		NuronMetaStructure largest = null;
		double largestDotProuduct = 0.0;

		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				double testDot = nuronList.get(i + (j * 1024)).testDot(inputToSOMVec);

				if (testDot > largestDotProuduct) {
					largestDotProuduct = testDot;
					largest = nuronList.get(i + (j * 1024));
				}
			}
		}
		if (largest != null) {
			winningNode = largest;
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
		// TODO Auto-generated method stub

	}

}
