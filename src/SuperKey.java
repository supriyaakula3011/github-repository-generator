public class SuperKey {
    public static void main(String[] args) 
        {
            B4 obj2=new B4(5);
        }
}
class A4 extends Object
{
    public A4()
    {
        System.out.println("in const A");
    }
        public A4(int i)
        {
            super();
        System.out.println("in const A parameter");           
        }
}
class B4 extends A4
{
    public B4()
    {
        System.out.println("in const B");
    }   
    public B4(int i)
    {
        super(i);
    System.out.println("in const B parameter");           
    }
}
