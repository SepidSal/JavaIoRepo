package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/
public class DataOutputStream {
    public static void main(String args[]){
        try{
            FileOutputStream fout = new FileOutputStream("C:\\sepidsal.txt");
            DataOutputStream dout = new DataOutputStream(fout);
            
            dout.write(70);
            dout.flush();
            dout.close();
            System.out.print("Success");
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
