

import java.util.Scanner;
public class CsvMenu
{
	public static void printMenu()
   	{
   		System.out.println("1. Search by first name");
      	System.out.println("2. Search by last name");
      	System.out.println("3. Search by phone number");
      	System.out.println("4. Exit");
   	}

   	public static int selectFromMenu()
   	{
      	Scanner scanner = new Scanner(System.in);
      	int option = scanner.nextInt();
      	return option;
   	}
   
   	public static void searchByFirstName(CsvCatalog catalog)
   	{
   		Scanner scanner = new Scanner(System.in);
         String fName;
      	System.out.println("Enter first name: ");
      	fName = scanner.nextLine();
      	Csv[] matchedCsvs = catalog.searchByFirstName(fName);
      	if (matchedCsvs.length == 0)
      	{
         	System.out.println("No matches found");
      	}

      	for (int i = 0; i < matchedCsvs.length; i++)
      	{
      	   	System.out.println(matchedCsvs[i]); 
      	}
   	}

      public static void searchByLastName(CsvCatalog catalog)
      {
         Scanner scanner = new Scanner(System.in);
         String lName;
         System.out.println("Enter last name: ");
         lName = scanner.nextLine();
         Csv[] matchedCsvs = catalog.searchByLastName(lName);
         if (matchedCsvs.length == 0)
         {
            System.out.println("No matches found");
         }

         for (int i = 0; i < matchedCsvs.length; i++)
         {
               System.out.println(matchedCsvs[i]); 
         }
      }

      public static void searchByNumber(CsvCatalog catalog)
      {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter phone number: ");
         String sNumber = scanner.nextLine();
         int number = Integer.parseInt(sNumber);
         Csv[] matchedCsvs = catalog.searchByNumber(number);
         if (matchedCsvs.length == 0)
         {
            System.out.println("No matches found");
         }

         for (int i = 0; i < matchedCsvs.length; i++)
         {
               System.out.println(matchedCsvs[i]); 
         }
      }

   	public static void main(String []args)
   	{
      	CsvCatalog catalog = new CsvCatalog();

      	boolean quit = false;
   
      	while (!quit)
      	{
         	printMenu();
         	int option = selectFromMenu();
         	switch (option)
         	{
            	case 1:
                     searchByFirstName(catalog);
               		break;
            	case 2:
               		searchByLastName(catalog);
               		break;
            	case 3:
               		searchByNumber(catalog);
               		break;
            	case 4:
               		quit = true;
               		break;

         	} // switch

      	} // while (! quit)
   	}
}