package string;
import java.util.*;
public class Length {
   public static void main(String args[])
    {
        String str1,str2;
        Scanner sc=new Scanner(System.in);
    System.out.println("enter 2 staring");
    str1=sc.nextLine();
    str2=sc.nextLine();
    int l1=str1.length();
    int l2=str2.length();  
            System.out.println("length of str1: "+l1);
        System.out.println("length of str2: "+l2);
    String str3=str1+str2;
        System.out.println("result: "+str3);
        str1=str1.toUpperCase();
        System.out.println("str1 in uppercase: "+str1);
    }
}
