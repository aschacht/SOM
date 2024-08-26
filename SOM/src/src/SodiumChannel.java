package src;


public class SodiumChannel{
		BaseNuron rootNuron;
		double channelValue;
		
		public SodiumChannel(BaseNuron base){
				rootNuron=base;
		}
		
		public void setOwningNuron(BaseNuron base){
			rootNuron = base;
		}
		public double channelValue(){
			return channelValue;
		}
	}
