public class ConstOverloading {
    public static void main(String[] args) 
        {
            Abc1 obj=new Abc1(5);
        }   
}
class Abc1
{
    public Abc1()
    {
        System.out.println("in abc constructor");
    }
    public Abc1(int i)
    {
        System.out.println("in abc constructor int");
    }
    public Abc1(double d)
    {
        System.out.println("in abc constructor intDouble");
    }
}
