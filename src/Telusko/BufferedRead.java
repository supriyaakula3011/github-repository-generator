package Telusko;
import java.io.*;
public class BufferedRead {
    public static void main(String args[]) throws Exception
    {
        System.out.println("enter number");
        InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(is);
        int n = Integer.parseInt(br.readLine());
         System.out.println(n);
    }
}
