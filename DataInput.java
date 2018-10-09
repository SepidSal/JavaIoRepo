import java.io.*;


public class DataInput {
    public static void main(String args[]){
        try{
            InputStream input = new FileInputStream("D:\\faradars.txt");
            DataInputStream dis = new DataInputStream(input);
            int count = input.available();
            byte[] array = new byte[count];
            dis.read(array);
            for(byte bt:array){
                char chr=(char) bt;
                System.out.print(chr);
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
