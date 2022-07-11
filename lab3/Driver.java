public class Driver
{
	public static void main(String []args)
	{

		Pizza a = new Pizza();
		Topping t = new Topping("Pepperoni");
		a.addTopping(t);
		a.getToppings();
	}
}