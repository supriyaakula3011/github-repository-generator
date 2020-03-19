public class ObjConst {
    public static void main(String[] args) 
        {
            A obj=new B(5);
        }
}
class A
{
    public A()
    {
        System.out.println("in A const");
    }
    public A(int i)
    {
        System.out.println("in A const Int");
    }
}
class B extends A
{
    public B()
    {
        System.out.println("in B const");
    }
    public B(int i)
    {
        super();
        System.out.println("in B const Int");
    }
}
