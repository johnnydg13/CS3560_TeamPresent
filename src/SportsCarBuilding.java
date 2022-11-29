
public class SportsCarBuilding extends NewCarBuilding{

	@Override
	protected NewCar makeNewCar(String typeOfCar) 
	{
		// TODO Auto-generated method stub
		NewCar theNewCar = null;

		if(typeOfCar.equals("F"))
		{
			NewCarFactory carPartsFactory = new SportsCarFactory();
			theNewCar = new SportsCar(carPartsFactory);
			
			theNewCar.setName("Ferrari Sports Car");
		}

		else
		{
			if(typeOfCar.equals("L"))
			{
				NewCarFactory carPartsFactory = new SportsCarFactory();
				theNewCar = new SportsCar(carPartsFactory);
				
				theNewCar.setName("Lambo Sports Car");
			}
		}
		return theNewCar;
	}

}
