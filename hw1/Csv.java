public class Csv
{
   private String fName, lName;
   private int number;

   Csv(String fName, String lName, int number)
   {
      this.fName = fName;
      this.lName = lName;
      this.number = number;
   }

   public String toString()
   {
      String csvString = "(" + fName + " , " +lName + " , " +number + ")";
      return csvString;
   }

   public boolean firstNameMatches(String fName)
   {
      return this.fName.equals(fName);
   }

   public boolean lastNameMatches(String lName)
   {
      return this.lName.equals(lName);
   }

   public boolean numberMatches(int number)
   {
      return (this.number == number);
   }
}