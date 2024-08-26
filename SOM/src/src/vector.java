package src;

	public class vector{
		double xdimension;
		double ydimension;
		double zdimension;
		double wdimension;
		double w1dimension;
		double w2dimension;
		double tdimension;
		
		public vector(double xdim,double ydim,double zdim,double wdim,double w1dim,double w2dim,double tdim){
			xdimension=xdim;
			ydimension=ydim;
			zdimension=zdim;
			wdimension=wdim;
			w1dimension=w1dim;
			w2dimension=w2dim;
			tdimension=tdim;			
		}
		
		
		public void setTdimension(double tdimension) {
			this.tdimension = tdimension;
		}
		public void setW2dimension(double w2dimension) {
			this.w2dimension = w2dimension;
		}
		public void setW1dimension(double w1dimension) {
			this.w1dimension = w1dimension;
		}
		public void setWdimension(double wdimension) {
			this.wdimension = wdimension;
		}
		public void setZdimension(double zdimension) {
			this.zdimension = zdimension;
		}
		public void setYdimension(double ydimension) {
			this.ydimension = ydimension;
		}
		public void setXdimension(double xdimension) {
			this.xdimension = xdimension;
		}
		
		public double getTdimension() {
			return tdimension;
		}
		public double getW2dimension() {
			return w2dimension;
		}
		public double getW1dimension() {
			return w1dimension;
		}
		public double getWdimension() {
			return wdimension;
		}
		public double getXdimension() {
			return xdimension;
		}
		public double getYdimension() {
			return ydimension;
		}
		public double getZdimension() {
			return zdimension;
		}


		public double Dot(vector vec) {
				double dotproduce =  (wdimension*vec.wdimension)+(w1dimension*vec.w1dimension)+(w2dimension*vec.w2dimension);
				return dotproduce;

		}
		
		
		public vector Subtract(vector vec){ 
			return new vector(0,0,0,this.wdimension-vec.wdimension,this.w1dimension-vec.w1dimension,this.w2dimension-vec.w2dimension,0);
		}
		
		
		
		
		
	}