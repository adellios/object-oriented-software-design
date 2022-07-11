public class Driver
{
	public static void main(String []args)
	{
		Car a = new Car("Model", "Make", 2019, 4, "Sedan");
		Motorcycle b = new Motorcycle("Model", "Make", 2019, "Street", true);
		Truck c = new Truck("Model", "Make", 2019, 12.5f, 2, 500.5f);

		a.toString();
		b.toString();
		c.toString();
	}
}