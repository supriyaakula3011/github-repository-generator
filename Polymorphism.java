public class Polymorphism {
    public static void main(String[] args) 
        {
            A1 obj=new A1();
            obj.show1(5.5);
        }
}
class A1
{
    public void show1()
    {
        System.out.println("hi");
    }
    public void show1(int i)
    {
        System.out.println("hello"+i);
    }
    public void show1(double d)
    {
        System.out.println("how are you");
    }
}