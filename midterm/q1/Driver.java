import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;

public class WriteToFileDriver
{
  public static void write(ArrayList<Integer> data, String fileName)
  {
    FileWriter writer = null;
    try {
      writer = new FileWriter(fileName);
    }
    catch(IOException e) {
        System.out.println("Can't write to file.");
      }
    
    for (int i = 0; i < data.size(); i++)
    {
      try {
        writer.write(data.get(i));
      }
      catch(IOException e) {
        System.out.println("Can't write to file.");
      }
    }
  }
  public static void main(String []args)
   {
      ArrayList<Integer> myNumbers = null;
      for(int i = 0; i < 10; i++)
      {
          myNumbers.add(i);
      }
       
      write(myNumbers, "./results.txt");
   }
}