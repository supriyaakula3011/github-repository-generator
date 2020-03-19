public class StaticKeyword {
  public static void main(String[] args) 
        {
             Abc2.show();
        }   
}
class Abc2
{
    //int i=5;
    static int i;
    public static void show()
    {
        System.out.println("hi");
        System.out.println(i);
    }
}

