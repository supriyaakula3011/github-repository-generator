public class ThisKeyword {
   public static void main(String[] args) 
    {
     A7 obj=new A7(6);
     obj.show();
     
    }
}
class A7
{
    private int x;
public A7(int x)
{
    this.x=x;
  
} 
public void show()
{
System.out.println("x is "+ x);
}
}
