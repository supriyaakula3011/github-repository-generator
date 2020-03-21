package Telusko;
import java.io.*;
public class FileHandling {
    public static void main(String args[]) throws Exception
    {
        File f=new File("demo.txt");
        FileOutputStream fos=new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("Demo Content");
        FileInputStream fis=new FileInputStream(f);        
        DataInputStream dis=new DataInputStream(fis);        
        String str=dis.readUTF();
        System.out.println(str);
} 
}