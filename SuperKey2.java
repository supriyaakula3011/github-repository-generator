public class SuperKey2 {
    public static void main(String[] args) 
        {
            B5 obj1=new B5();
            obj1.abc();
        }
}
class A5
{
public void abc()
{
  System.out.println("A const abc");
}
}
class B5 extends A5
{
    int i=4;
    
    public void abc()
    {
        super.abc();
        System.out.println("B  const abc");
    }   
}
