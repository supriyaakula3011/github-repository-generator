public class Inheritance {
     public static void main(String[] args) 
        {
           AdSub obj=new AdSub();
           obj.n1=6;
           obj.n2=4;
           obj.sum();
           System.out.println(obj.r);
           obj.sub();
           System.out.println(obj.r);
        }
}
class Ad
{
    int n1,n2,r;
    public void sum()
    {
        r=n1+n2;
    }
}
class AdSub extends Ad
{
    public void sub()
    {
        r=n1-n2;
    }
}