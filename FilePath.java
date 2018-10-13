package sepidsal;

import java.io.File;
/**
*
* @author Sepideh Saljooghi
*/
public class FilePath {
    public static void main(String args[]){
        try{
            File f = new File("D:\\sepidsal.txt");
                System.out.println(f.getName());
                System.out.println(f.getPath());
                System.out.println(f.getParent());
                
        }
        catch(Exception e){
            System.out.print(e);
        }
        
    }
}
