public class MultilevelInheritance {
    public static void main(String[] args) 
        {
           Add1subMul obj=new Add1subMul();
           obj.n1=6;
           obj.n2=4;
           obj.sum();
           System.out.println(obj.r);
           obj.sub();
           System.out.println(obj.r);
           obj.mul();
           System.out.println(obj.r);
        }
}
class Ad1
{
    int n1,n2,r;
    public void sum()
    {
        r=n1+n2;
    }
}
class Ad1Sub extends Ad1
{
    public void sub()
    {
        r=n1-n2;
    }
   
}
class Add1subMul extends Ad1Sub
{
    public void mul()
    {
        r=n1*n2;
    }
}