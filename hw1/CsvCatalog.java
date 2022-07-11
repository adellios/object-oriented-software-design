import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvCatalog
{
   private ArrayList<Csv> csvs;

   CsvCatalog()
   {
      csvs = new ArrayList<Csv>();
   }

   public Csv[] list()
   {
      Csv []b ={};
      return csvs.toArray(b);
   }

   /*
    * Loads book caltalog from a CSV file
    * File format is:
    * first name, last name, phone number
    */
   public void fromCSV(String file)
   {
      try
      {
         Scanner s = new Scanner(new BufferedReader(new FileReader(file)));
         fromScanner(s);
      }
      catch(Exception e)
      {}
   }

  
   private void fromScanner(Scanner s)
   {
      while (s.hasNext())
      {
         String line = s.nextLine();
         String []values = line.split(",");
         String fName = values[0];
         String lName = values[1].trim();
         String sNumber = values[2].trim();
         int number = Integer.parseInt(sNumber);
         Csv csv = new Csv(fName, lName, number);
         add(csv);
      }
   }

   public void add(Csv csv)
   {
      csvs.add(csv);
   }

   public Csv[] searchByNumber(int number)
   {
      ArrayList<Csv> matches = new ArrayList<Csv>();
      for (int i = 0; i < csvs.size(); i++)
      {
          if (csvs.get(i).numberMatches(number))
          {
             matches.add(csvs.get(i));
          }
      }
      Csv []b ={};
      return matches.toArray(b);
   }

   public Csv[] searchByFirstName(String fName)
   {
      ArrayList<Csv> matches = new ArrayList<Csv>();
      for (int i = 0; i < csvs.size(); i++)
      {
          if (csvs.get(i).firstNameMatches(fName))
          {
             matches.add(csvs.get(i));
          }
      }
      Csv []b ={};
      return matches.toArray(b);
   }

   public Csv[] searchByLastName(String lName)
   {
      ArrayList<Csv> matches = new ArrayList<Csv>();
      for (int i = 0; i < csvs.size(); i++)
      {
          if (csvs.get(i).lastNameMatches(lName))
          {
             matches.add(csvs.get(i));
          }
      }
      Csv []b ={};
      return matches.toArray(b);
   }
}