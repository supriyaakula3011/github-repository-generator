public class Constructor {
    public static void main(String[] args) 
        {
            Abc obj=new Abc(6,5.5);
        }   
}
class Abc
{
    public Abc()
    {
        System.out.println("in abc constructor");
    }
    public Abc(int i)
    {
        System.out.println("in abc constructor parameter");
    }
    public Abc(int i,double d)
    {
        System.out.println("in abc constructor intDouble");
    }
}
