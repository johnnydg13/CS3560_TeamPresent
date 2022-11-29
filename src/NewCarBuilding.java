
public abstract class NewCarBuilding {

	protected abstract NewCar makeNewCar(String typeOfCar);

	public NewCar orderTheCar(String typeOfCar)
	{
		NewCar theNewCar = makeNewCar(typeOfCar);

		theNewCar.makeCar();
		theNewCar.newCarInfo();


		return theNewCar;


	}

}
