package sepidsal;

import java.io.File;
/**
*
* @author Sepideh Saljooghi
*/
public class CreateFile {
    public static void main(String args[]){
        try{
            File f = new File("D:\\sepidsal.txt");
            if(f.createNewFile()){
                System.out.print("File Created");
            }
            else
            {
                System.out.print("File exists!");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
        
    }
}
