package myproject;
class B
{
    
}
class A extends B
{
    
}
public class ReflectionApi{
    public static void main(String args[]) throws Exception
    {
     Class c=Class.forName("myproject.A");
     System.out.println(c.getSuperclass());
    }
}
