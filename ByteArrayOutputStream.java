package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/
public class ByteArrayOutputStream {
    public static void main(String args[]){
      try{
            FileOutputStream fout = new FileOutputStream("C:\\sepidsal.txt");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(65);
            bout.writeTo(fout);
            bout.flush();
            System.out.print("Success");
      }
      catch(Exception e){
          System.out.print(e);
      }
    }
}
