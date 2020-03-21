package ExceptionHandling;
public class DemoEx {
    public static void main(String args[])
    {
    int i,j,k=0;
    i=8;
    j=0;
    try
    {
    k=i/j;
    }
    catch(ArithmeticException e)
    {
    System.out.println("not divide by zero"+e);
    }
    System.out.println(k);

}
}
