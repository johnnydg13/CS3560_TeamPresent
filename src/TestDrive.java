
public class TestDrive {

	public static void main(String[] args)
	{
		NewCarBuilding MakeSportsCar = new SportsCarBuilding();

		NewCar theRarri = MakeSportsCar.orderTheCar("F");
	
		System.out.println(theRarri.newCarInfo() + "\n");

		NewCar theLambo = MakeSportsCar.orderTheCar("L");
		System.out.println(theLambo.newCarInfo() + "\n");
		
		NewCarBuilding MakeSedanCar = new SedanCarBuilding();

		NewCar theHonda = MakeSedanCar.orderTheCar("H");
	
		System.out.println(theHonda.newCarInfo() + "\n");

		NewCar theToyota = MakeSedanCar.orderTheCar("T");
		System.out.println(theToyota.newCarInfo() + "\n");

	}

}
