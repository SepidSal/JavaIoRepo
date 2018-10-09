package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/

public class Buffred {
    public static void main(String args[]){
        try{
            FileReader reader = new FileReader("C:\\sepidsal.txt");
            BufferedReader bfr= new BufferedReader(reader);
            
            int i;
            while((i=bfr.read())!=-1){
                System.out.print((char)i);
            }
            bfr.close();
            reader.close();
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
