package src;
public class nuron  extends BaseNuron implements NuronMetaStructure{

		
	
		public nuron(vector seedVec){
			this.typeOfNuron = NuralType.NEIGHBORHOOD;
			this.vectorOfNuron =seedVec;
		}
		
		
		
		public vector getVectorOfNuron(){
			return this.vectorOfNuron;
		}
		
		
		public void adjustVector(vector changeInVec){
			this.vectorOfNuron.setNDimension(3,this.vectorOfNuron.dimensions[3]+changeInVec.dimensions[3]);
			this.vectorOfNuron.setNDimension(4,this.vectorOfNuron.dimensions[4]+changeInVec.dimensions[4]);
		}
		
		public double testDot(vector vec){
			double dotproduce =  (this.vectorOfNuron.dimensions[3]*vec.dimensions[3])+(this.vectorOfNuron.dimensions[4]*vec.dimensions[4]);
			return dotproduce;
		}
		
		public double testDistance(vector vec){
			double distance = Math.sqrt(Math.pow((vec.dimensions[0] -this.vectorOfNuron.dimensions[0]),2)+Math.pow((vec.dimensions[1] -this.vectorOfNuron.dimensions[1]),2));
			return distance;
		}



		@Override
		public NuralType typeOfNuron() {
			return this.typeOfNuron;
		}



		@Override
		public int getDimensions() {
			return vectorOfNuron.dimensions.length;
		}
		
		

		
		
	}