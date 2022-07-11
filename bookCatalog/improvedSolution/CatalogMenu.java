/*
 * Driver code for entering books into a catalog
 */

import java.util.Scanner;
public class CatalogMenu
{
   public static void printMenu()
   {
      System.out.println("1. Add new book");
      System.out.println("2. Search by title");
      System.out.println("3. Search by author");
      System.out.println("4. List all books");
      System.out.println("5. Load books from file");
      System.out.println("6. Exit");
   }

   public static int selectFromMenu()
   {
      Scanner scanner = new Scanner(System.in);
      int option = scanner.nextInt();
      return option;
   }

   public static void addBook(BookCatalog catalog)
   {
      Scanner scanner = new Scanner(System.in);
      String title, firstName, lastName;
      System.out.println("Enter book title: ");
      title = scanner.nextLine();
      System.out.println("Enter author's first name: ");
      firstName = scanner.nextLine();
      System.out.println("Enter author's last name: ");
      lastName = scanner.nextLine();

      Book book = new Book(title, firstName, lastName);
      catalog.add(book); 
   }

   public static void searchByTitle(BookCatalog catalog)
   {
      Scanner scanner = new Scanner(System.in);
      String title;
      System.out.println("Enter book title: ");
      title = scanner.nextLine();
      Book[] matchedBooks = catalog.searchByTitle(title);
      if (matchedBooks.length == 0)
      {
         System.out.println("No matches found");
      }

      for (int i = 0; i < matchedBooks.length; i++)
      {
         System.out.println(matchedBooks[i]); 
      }
   }
 
   public static void searchByAuthor(BookCatalog catalog)
   {
      Scanner scanner = new Scanner(System.in);
      String author;
      System.out.println("Enter author last name: ");
      author = scanner.nextLine();
      Book[] matchedBooks = catalog.searchByAuthor(author);
      if (matchedBooks.length == 0)
      {
         System.out.println("No matches found");
      }

      for (int i = 0; i < matchedBooks.length; i++)
      {
         System.out.println(matchedBooks[i]); // Book class needs toString() method
      }
     
   }

   public static void listBooks(BookCatalog catalog)
   {
      Book[] books = catalog.list();
      for (int i = 0; i < books.length; i++)
      {
         System.out.println(books[i]);
      }
   }

   public static void loadBooks(BookCatalog catalog)
   {
      System.out.println("Enter file name:");
      Scanner in = new Scanner(System.in);
      String fileName = in.nextLine();
      catalog.fromCSV(fileName);
   }
   public static void main(String []args)
   {
      BookCatalog catalog = new BookCatalog();

      boolean quit = false;
   
      while (!quit)
      {
         printMenu();
         int option = selectFromMenu();
         switch (option)
         {
            case 1:
               addBook(catalog);
               break;
            case 2:
               searchByTitle(catalog);
               break;
            case 3:
               searchByAuthor(catalog);
               break;
            case 4:
               listBooks(catalog);
               break;
            case 5:
               loadBooks(catalog);
               break;
            case 6:
               quit = true;
               break;

         } // switch

      } // while (! quit)
   }
}
