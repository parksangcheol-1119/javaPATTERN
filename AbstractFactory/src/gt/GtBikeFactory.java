package gt;

import avstract.BikeFactory;
import avstract.Body;
import avstract.Wheel;

public class GtBikeFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}

}
