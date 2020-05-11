class Spy
{
public static void main(String args[])
{
int n=123,s=0,m=1,r;
while(n>0)
{
r=n%10;
s=s+r;
m=m*r;
n=n/10;
}
if(s==m)
{
System.out.println("spy");
}
else
{
System.out.println("not spy");
}
}
}


