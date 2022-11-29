
public class SportsCar extends NewCar{

	NewCarFactory carFactory;

	protected SportsCar(NewCarFactory carFactory)
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
