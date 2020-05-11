class LongestSubString
{
public static void main(String args[])
{
int i=0,j,l1,l2;
char ch;
String s="abcabd";
String s1=" ";
l1=s.length();
while(i<l1)
{
ch=s.charAt(i);
l2=s1.length();
j=0;
while(j<l2)
{
if(ch==s1.charAt(j))
break;
else
j++;
}
if(j==l2)
{
s1=s1+ch;
i++;
}
else
break;
}
System.out.println(s1);
System.out.println(+s1.length());
}
}





