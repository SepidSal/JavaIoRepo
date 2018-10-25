package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/

public class WriteRandom {
    public static void main(String args[]){
        try{
            File fdfile = new File("C:\\sepidsal.txt");
            RandomAccessFile rndFile = new RandomAccessFile(fdfile, "rw");
            rndFile.writeUTF("SepidSal");
            rndFile.writeInt(52);
            rndFile.writeFloat(5.2f);
            rndFile.close();
            System.out.print("Done!");
            
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
