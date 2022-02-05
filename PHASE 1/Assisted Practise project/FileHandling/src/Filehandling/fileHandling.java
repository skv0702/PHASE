package Filehandling;

import java.io.FileReader;
import java.io.FileWriter;

public class fileHandling {
public static void main (String []args) {
    String data = "this file shows the working of reading and writing a file";
    try {
      // Creates a Writer using FileWriter
      FileWriter output = new FileWriter("input.txt");

      // Writes string to the file
      output.write(data);
      System.out.println("Data is written to the file.");

      // Closes the writer
      output.close();
      
      System.out.println("\n");
      char[] array = new char[100];
     
      FileReader output1 = new FileReader("input.txt");
      // Reads characters
      output1.read(array);
      System.out.println("Data in the file:");
      System.out.println(array);

      // Closes the reader
      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
 }
}
