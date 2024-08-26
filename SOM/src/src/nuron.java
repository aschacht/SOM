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
			this.vectorOfNuron.wdimension = this.vectorOfNuron.wdimension+changeInVec.wdimension;
			this.vectorOfNuron.w1dimension = this.vectorOfNuron.w1dimension+changeInVec.w1dimension;
			this.vectorOfNuron.w2dimension = this.vectorOfNuron.w2dimension+changeInVec.w2dimension;
		}
		
		public double testDot(vector vec){
			double dotproduce =  (this.vectorOfNuron.wdimension*vec.wdimension)+(this.vectorOfNuron.w1dimension*vec.w1dimension)+(this.vectorOfNuron.w2dimension*vec.w2dimension);
			return dotproduce;
		}
		
		public double testDistance(vector vec){
			double distance = Math.sqrt(Math.pow((vec.xdimension -this.vectorOfNuron.xdimension),2)+Math.pow((vec.ydimension -this.vectorOfNuron.ydimension),2));
			return distance;
		}



		@Override
		public NuralType typeOfNuron() {
			return this.typeOfNuron;
		}
		
		

		
		
	}