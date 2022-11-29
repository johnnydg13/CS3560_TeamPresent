
public class SedanCarBuilding extends NewCarBuilding{

	@Override
	protected NewCar makeNewCar(String typeOfCar) {
		// TODO Auto-generated method stub
		NewCar theNewCar = null;

		if(typeOfCar.equals("H"))
		{
			NewCarFactory carPartsFactory = new SedanCarFactory();
			theNewCar = new SportsCar(carPartsFactory);
			
			theNewCar.setName("Honda Sedan");
		}

		else
		{
			if(typeOfCar.equals("T"))
			{
				NewCarFactory carPartsFactory = new SedanCarFactory();
				theNewCar = new SportsCar(carPartsFactory);
				
				theNewCar.setName("Toyota Sedan");
			}
		}
		return theNewCar;
	}
	

}
