
public class Vehicle
{
	public String make, model;
	public int year;

	public Vehicle(String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake()
	{
		return make;
	}

	public String getModel()
	{
		return model;
	}

	public int getYear()
	{
		return year;
	}

	public String setMake()
	{
		this.make = make;
		return make;
	}

	public String setModel()
	{
		this.model = model;
		return model;
	}

	public int setYear()
	{
		this.year = year;
		return year;
	}

	public String toString()
	{
		return make + " " + model + " " + year + " ";
	}
}