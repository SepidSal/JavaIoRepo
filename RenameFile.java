package sepidsal;

import java.io.File;
/**
*
* @author Sepideh Saljooghi
*/
public class RenameFile {
    public static void main(String args[]){
        try{
            File f = new File("D:\\sepidsal.txt");
            File nf = new File("D:\\salsepid.txt");
            if(f.renameTo(nf)){
                System.out.print("File Renamed");
            }
            else
            {
                System.out.print("Nothing For Rename!");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
        
    }
}
