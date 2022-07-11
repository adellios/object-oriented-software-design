public class Car extends Vehicle
	{
		private int doors;
		private String bodyStyle;

		Car(String make, String model, int year, int doors, String bodyStyle)
		{
			super(make, model, year);
			this.doors = doors;
			this.bodyStyle = bodyStyle;
		}

		public int getDoors()
		{
			return doors;
		}

		public String getBodyStyle()
		{
			return bodyStyle;
		}

		public int setDoors()
		{
			this.doors = doors;
			return doors;
		}

		public String setBodyStyle()
		{
			this.bodyStyle = bodyStyle;
			return bodyStyle;
		}

		public String toString()
		{
			return make + " " + model + " " + year + " " + doors + " " + bodyStyle;
		}
	}