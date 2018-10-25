package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/

public class ReadRandomFile {
    public static void main(String args[]){
        try{
            File fdfile = new File("C:\\sepidsal.txt");
            RandomAccessFile rndFile = new RandomAccessFile(fdfile, "r");
            
            String str="";
            
            while((str = rndFile.readLine())!=null){
                System.out.println(str);
            }
        
            
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
