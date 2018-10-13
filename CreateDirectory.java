package sepidsal;

import java.io.File;
/**
*
* @author Sepideh Saljooghi
*/
public class CreateDirectory {
    public static void main(String args[]){
        try{
            File f = new File("D:\\NewFile\\NewFolder");
            if(f.mkdirs()){
                System.out.print("Folder Created");
            }
            else
            {
                System.out.print("Folder exists!");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
        
    }
}
