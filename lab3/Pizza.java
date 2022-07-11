public class Pizza
{
	private Topping[] toppings;

	public Topping[] getToppings()
	{
		for (int i = 0; i < toppings.length; i++)
		{
			System.out.println(toppings[i]);
		}
		return toppings;
	}
	
	public void addTopping(Topping t)
	{
		toppings[0] = t;
	}
}