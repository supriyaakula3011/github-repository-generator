package Telusko;
import java.io.*;
import java.util.*;
public class App {
    public static void main(String args[]) throws Exception
    {
        Properties p=new Properties();
        File f=new File("demo.txt");
        OutputStream os=new FileOutputStream("dataConfig.Properties");
        p.setProperty("url","host:3306/myDb");
        p.setProperty("uname","supriya");
        p.setProperty("pswd","3011");
        p.store(os, null);
} 
}