import java.util.Scanner;
import java.io.*;

//THERE IS SOMETHING WRONG WITH THIS! TERRIBLY WRONG THAT PREVENTS FILE READING
//IF 'TextfileIO' isn't wrong idk what is?
public class TextFileIO 
{
  
   public static PrintWriter createTextWrite(String S) throws FileNotFoundException
   {
       PrintWriter TStream = null;
       if (TStream == null)
       {
           TStream = new PrintWriter(new FileOutputStream(S));
       }
       else
       {
           System.out.println("Error opening the file in createTextWrite");
           System.exit(0);
       }
       return TStream;
   }
  
   public static Scanner createTextRead(String S)
   {
       Scanner textFile = null;
       try
       {
           textFile = new Scanner(new File(S));
       }
       catch(FileNotFoundException e)
       {
           System.out.println("File not found");
           System.out.println("or could not be opened.");
       }
       return textFile;
   }
}