import Sam.SamFactory;
import avstract.BikeFactory;
import avstract.Body;
import avstract.Wheel;
import gt.GtBikeFactory;

public class Main {

	public static void main(String[] args) {


		//BikeFactory factory = new SamFactory();
		BikeFactory factory = new GtBikeFactory();
		
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
	
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}

}
