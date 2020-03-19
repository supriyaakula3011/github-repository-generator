public class MethodDispatch {
    public static void main(String[] args) 
        {
            A3 obj1=new A3();
            B3 obj2=new B3();
            A3 a;
            a=obj2;
            a.show();
        }
}
class A3
{
    public void show()
    {
        System.out.println("in A class");
    }
}
class B3 extends A3
{
    public void show()
    {
        System.out.println("in B class");
    }   
}
