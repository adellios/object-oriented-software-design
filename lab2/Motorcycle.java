public class Motorcycle extends Vehicle
	{
		private String type;
		private boolean sidecar;

		Motorcycle(String make, String model, int year, String type, boolean sidecar)
		{
			super(make, model, year);
			this.type = type;
			this.sidecar = sidecar;
		}

		public String getType()
		{
			return type;
		}

		public boolean getSidecar()
		{
			return sidecar;
		}

		public String setType()
		{
			this.type = type;
			return type;
		}

		public boolean setSidecar()
		{
			this.sidecar = sidecar;
			return sidecar;
		}

		public String toString()
		{
			return make + " " + model + " " + year + " " + type + " " + sidecar;
		}
	}
