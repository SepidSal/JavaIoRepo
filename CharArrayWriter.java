package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/
public class CharArrayWriter {
    public static void main(String args[]){
        try{
            FileWriter fileW = new FileWriter("C:\\sepidsal.txt");
            CharArrayWriter chaw = new CharArrayWriter();
            String S = "Sepid Sal";
            chaw.write(S);
            chaw.writeTo(fileW);
            fileW.close();
            System.out.print("Success");
            
        }
        catch(Exception e){
            System.out.print(e);
        }
}
}
