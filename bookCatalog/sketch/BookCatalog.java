/*
 * Book catalog 
 */

import java.util.ArrayList;
public class BookCatalog
{
   private ArrayList<Book> books;

   BookCatalog()
   {
      books = new ArrayList<Book>();
   }

   public void add(Book book)
   {
      books.add(book);
   }

   public Book[] searchByTitle(String title)
   {
      return null;
   }

   public Book[] searchByAuthor(String author)
   {
      return null;
   }
}
