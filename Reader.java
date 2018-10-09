package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/

public class Reader {
    public static void main(String args[]){
        try{
            FileReader reader = new FileReader("C:\\sepidsal.txt");
            int data = reader.read();
            while(data!=-1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
