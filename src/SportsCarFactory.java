
public class SportsCarFactory implements NewCarFactory{

	@Override
	public MaxSpeed setCarSpeed() {
		// TODO Auto-generated method stub
		return new SportsCarMaxSpeed();
	}

	@Override
	public MPG setCarMpg() {
		// TODO Auto-generated method stub
		return new SportsCarMpg();
	}

}
