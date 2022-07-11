public class Circle
{
	private int radius;

	public Circle(int radius)
	{
		this.radius = radius;
	}

	public float getArea()
	{
		return radius * radius * 3.1415926f;
	}

	public float getCircumference()
	{
		return radius * 2 * 3.1415926f;
	}
}