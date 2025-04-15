package src;

	public class vector{
		double[] dimensions;
		public vector(double ...dims){			
		
		dimensions = dims;
		
		
		}
		
		
		public double getNdimension(int n) {
			return dimensions[n];
		}
		
		public double getTdimension() {
			return dimensions[6];
		}
		public double getW2dimension() {
			return dimensions[5];
		}
		public double getW1dimension() {
			return dimensions[4];
		}
		public double getWdimension() {
			return dimensions[3];
		}
		public double getXdimension() {
			return dimensions[0];
		}
		public double getYdimension() {
			return dimensions[1];
		}
		public double getZdimension() {
			return dimensions[2];
		}


		public double Dot(vector vec) {
				double dotproduce =  (this.dimensions[3]*vec.dimensions[3])+(this.dimensions[4]*vec.dimensions[4])+(this.dimensions[5]*vec.dimensions[5]);
				return dotproduce;

		}
		
		
		public vector Subtract(vector vec){ 
			return new vector(0,0,0,this.dimensions[3]-vec.dimensions[3],this.dimensions[4]-vec.dimensions[4],this.dimensions[5]-vec.dimensions[5],0);
		}


		public void setNDimension(int i, double d) {
			if(i<dimensions.length)
			dimensions[i]=d;
			
		}


		public int getNumberOfDimensions() {
			return dimensions.length;
		}
		
		
		
		
		
	}