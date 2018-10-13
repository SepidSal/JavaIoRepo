package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/
public class FileOutputStream {
    public static void main(String args[]){
        try{
            FileOutputStream fout = new FileOutputStream("C:\\sepidsal.txt");
            fout.write(90);
            fout.close();
            System.out.print("Success");
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
