package src;
import java.util.ArrayList;

public class nullNuron implements NuronMetaStructure {
	NuralType nuralType;
	
	
	public nullNuron(){
		this.nuralType = NuralType.NULLNURON;
	}

	@Override
	public vector getVectorOfNuron() {
		return new vector(0,0,0,0,0,0,0);
	}

	@Override
	public double testDot(vector vec) {
		return 0;
	}

	@Override
	public NuralType typeOfNuron() {
		return this.nuralType;
	}

	@Override
	public void adjustVector(vector changeInRefVec) {		
	}

	@Override
	public double testDistance(vector vectorOfNuron) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
