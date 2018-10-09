package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/

public class ByteArray {
   public static void main(String args[]){
       try{
           byte[] bas={10,20,30,40,40,60,70,80,90};
           ByteArrayInputStream bais = new ByteArrayInputStream(bas);
           int i=0;
       while((i=bais.read())!=-1){
           char ch = (char)i;
           System.err.println("Ascii Value is:" + i + " Charachter is:" + ch);
       }
       }
       catch(Exception e){
           System.out.print(e);
       }
   }
}
