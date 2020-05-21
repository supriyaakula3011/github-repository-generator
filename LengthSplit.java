class LengthSplit
{
public static void main(String args[])
{
String s="i am going";
String s1[];
s1=s.split(" ");
int l=s1.length; 
System.out.println(s1[l-2]);
System.out.println(l);
}
}