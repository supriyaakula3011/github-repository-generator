package string;
public class StringSplitting {
 public static void main(String args[])
 {
     String str=" supriya, akula, santhu, venkat, kumari";
     String name[]=str.split(",");
     for(String val:name)
     System.out.println(val);
}   
}