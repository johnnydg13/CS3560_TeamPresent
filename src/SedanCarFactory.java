
public class SedanCarFactory implements NewCarFactory {

	@Override
	public MaxSpeed setCarSpeed() {
		// TODO Auto-generated method stub
		return new SedanCarMaxSpeed();
	}

	@Override
	public MPG setCarMpg() {
		// TODO Auto-generated method stub
		return new SedanCarMpg();
	}

}
