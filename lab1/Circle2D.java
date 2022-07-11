
public class Circle2D
{
	private int x, y, radius;

	public Circle2D()
	{
		this.x = 0;
		this.y = 0;
		this.radius = 0;
	}

	public Circle2D(int x, int y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	int getX()
	{
		return x;
	}

	int getY()
	{
		return y;
	}

	int getRadius()
	{
		return radius;
	}

	public String toString()
	{
		String val = "(" + x + "," + y + "," + radius + ")";
		return val;
	}
}