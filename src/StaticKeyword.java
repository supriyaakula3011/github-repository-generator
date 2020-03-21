public class StaticKeyword {
  public static void main(String[] args) 
        {
             Abc2.show();
        }   
}
class Abc2
{
    static int i;
    public static void show()
    {
        System.out.println("hi");
        System.out.println(i);
    }
}

