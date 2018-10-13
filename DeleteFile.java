package sepidsal;

import java.io.File;
/**
*
* @author Sepideh Saljooghi
*/
public class DeleteFile {
    public static void main(String args[]){
        try{
            File f = new File("D:\\sepidsal.txt");
            if(f.delete()){
                System.out.print("File Deleted");
            }
            else
            {
                System.out.print("Nothing To Delete!");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
        
    }
}
