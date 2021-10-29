package adapter;



public class AdapterImpl implements Adapter {

	
	//Math math;
	
	/*
	  
	  public Float twiceOf(Float f){
	  
	  	Math.twoTime(f);
	  
	   return null;
	  }
	  
	 
	 * */
	@Override
	public Double twiceOf(Float num) {
		return Math.doubled(num.doubleValue());
	}

	@Override
	public Double halfOf(Float num) {
		return Math.half(num);
	}

}
