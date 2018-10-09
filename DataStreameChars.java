package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/

public class DataStreameChars {
    public static void main(String args[]){
        try{
            FileInputStream fis = new FileInputStream("C:\\sepidsal.txt");
            int i=0;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
