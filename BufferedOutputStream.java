package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/
public class BufferedOutputStream {
    public static void main(String args[]){
        try{
            FileOutputStream fout = new FileOutputStream("C:\\sepidsal.txt");
            BufferedOutputStream bout= new BufferedOutputStream(fout);
            String s="Sepid Sal";
            byte b[]=s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.print("Success");
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
