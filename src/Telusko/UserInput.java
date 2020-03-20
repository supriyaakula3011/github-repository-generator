package Telusko;
//import java.util.*;
public class UserInput {
    public static void main(String args[]) throws Exception
    {
        System.out.println("enter character");
        int i = System.in.read();
        System.out.println((char)i);
         String str="";
         while((i=System.in.read())!=48)
         {
             str=str+(char)i;
         }
         System.out.println(i);
    }
}