public class Cylinder
{
	private int height;
	private Circle base;
	
	public Cylinder(int height, Circle base)
	{
		this.height = height;
		this.base = base;
	}

	public float getArea()
	{
		float circleArea = base.getArea();
		return circleArea * height;
	}
}