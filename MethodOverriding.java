public class MethodOverriding {
    public static void main(String[] args) 
        {
            B2 obj=new B2();
            obj.show1();
        }
}
class A2
{
    public void show1()
    {
        System.out.println("in A class");
    }
}
class B2 extends A2
{
    public void show1()
    {
        System.out.println("in B class");
    }
}
