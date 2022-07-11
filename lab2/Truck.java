public class Truck extends Vehicle
	{
		private float bedLength, towCapacity;
		private int doors;

		Truck(String make, String model, int year, float bedLength, int doors, float towCapacity)
		{
			super(make, model, year);
			this.bedLength = bedLength;
			this.doors = doors;
			this.towCapacity = towCapacity;
		}

		public float getBedLength()
		{
			return bedLength;
		}

		public int getDoors()
		{
			return doors;
		}

		public float getTowCapacity()
		{
			return towCapacity;
		}

		public float setBedLength()
		{
			this.bedLength = bedLength;
			return bedLength;
		}

		public int setDoors()
		{
			this.doors = doors;
			return doors;
		}

		public float setTowCapacity()
		{
			this.towCapacity = towCapacity;
			return towCapacity;
		}

		public String toString()
		{
			return make + " " + model + " " + year + " " + bedLength + " " + doors + " " + towCapacity;
		}
	}
