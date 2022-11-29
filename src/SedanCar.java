
public class SedanCar extends NewCar{
	
	NewCarFactory carFactory;

	protected SedanCar(NewCarFactory carFactory)
	{
		this.carFactory = carFactory;
	}

	@Override
	void makeCar() {
		// TODO Auto-generated method stub
		System.out.println("Ordering new car: " + getName());

		speed = carFactory.setCarSpeed();
		mpg = carFactory.setCarMpg();

		
	}

}
