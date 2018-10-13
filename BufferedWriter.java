package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/
public class BufferedWriter {
    public static void main(String args[]){
        try{
            FileWriter fw = new FileWriter("C:\\sepidsal.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String s="Sepid Sal";
            bw.write(s);
            bw.close();
            System.out.print("Success");
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
