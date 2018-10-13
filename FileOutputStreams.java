package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/
public class FileOutputStreams {
    public static void main(String args[]){
        try{
            FileOutputStream fout = new FileOutputStream("C:\\sepidsal.txt");
            String s="Sepid Sal";
            byte b[]= s.getBytes();
            fout.write(b);
            fout.close();
            System.out.print("Success");
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
