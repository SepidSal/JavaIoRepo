package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/
public class FileWriter {
    public static void main(String args[]){
        try{
            FileWriter fw= new FileWriter("C:\\sepidsal.txt");
            String S = "Sepid Sal";
            fw.write(S);
            fw.close();
            System.out.print("Success");
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
