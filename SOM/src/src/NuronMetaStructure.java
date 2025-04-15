package src;

public interface NuronMetaStructure {
	
	vector getVectorOfNuron();

	double testDot(vector vec);
	NuralType typeOfNuron();

	void adjustVector(vector changeInRefVec);

	double testDistance(vector vectorOfNuron);
	int getDimensions();
}
