package string;
import java.util.*;
public class LengthOfString {
    public static void main(String args[])
    {
        String str1,str2;
        Scanner sc=new Scanner(System.in);
    System.out.println("enter 2 staring");
    str1=sc.nextLine();
    str2=sc.nextLine();
    String str3=str1.concat(str2);
        System.out.println("result: "+str3);
    }
}
