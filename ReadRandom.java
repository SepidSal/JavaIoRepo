package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/

public class ReadRandom {
    public static void main(String args[]){
        try{
            File fdfile = new File("C:\\sepidsal.txt");
            RandomAccessFile rndFile = new RandomAccessFile(fdfile, "rw");
            String s = rndFile.readUTF();
            System.out.println(s);
            int num = rndFile.readInt();
            System.out.println(num);
            float fnum= rndFile.readFloat();
            System.out.println(fnum);            
            rndFile.close();
            System.out.print("Done!");
            
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
