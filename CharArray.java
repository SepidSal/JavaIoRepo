package sepidsal;

import java.io.*;
/**
*
* @author Sepideh Saljooghi
*/

public class CharArray {
    public static void main(String args[]){
        try{
            char[] array = {'s','e','p','i','d','a','l'};
            CharArrayReader reader = new CharArrayReader(array);
            int i=0;
            while((i=reader.read())!=-1){
                char chr= (char)i;
                System.out.println(chr + " : " + i);
                
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
