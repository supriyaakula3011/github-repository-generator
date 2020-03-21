package Telusko;
import java.io.*;
import java.util.*;
public class PropertyFile {
    public static void main(String args[]) throws Exception
    {
        Properties p=new Properties();
        File f=new File("demo.txt");
        InputStream is=new FileInputStream("dataConfig.Properties");
        p.load(is);
        System.out.println(p.getProperty("uname"));
        System.out.println(p.getProperty("url"));
        p.list(System.out);
} 
}