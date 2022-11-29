
public abstract class NewCar {

	private String name;
	protected MaxSpeed speed;
	protected MPG mpg;

	

	protected String getName()
	{
		return name;
	}
	protected void setName(String newName)
	{
		name = newName;
	}
	
	protected MaxSpeed getSpeed()
	{
		return speed;
	}
	
	protected MPG getMpg()
	{
		return mpg;
	}

	abstract void makeCar();
	

	protected String newCarInfo()
	{

		String info = "The " + getName() + " has a max speed of " + getSpeed().toInt()
			+ " and gets " + getMpg().toInt() + " miles to the gallon.";

		return info;
	}

}
