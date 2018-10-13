package sepidsal;

import java.io.File;
/**
*
* @author Sepideh Saljooghi
*/
public class MoveFile {
    public static void main(String args[]){
        try{
            File f = new File("D:\\sepidsal.txt");
            File nf = new File("D:\\Folder1\\Folder2\\Folder3\\sepidsal.txt");
            if(f.renameTo(nf)){
                System.out.print("File Moved!");
            }
            else
            {
                System.out.print("Nothing For Move!");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
        
    }
}
