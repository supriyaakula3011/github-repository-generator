package ExceptionHandling;
import java.io.*;
public class CheckedException {
    public static void main(String args[])
    {
        int j=1,k=0,i;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    i=8;
    try
    {
    j=Integer.parseInt(br.readLine());
    k=i/j;
    }
    catch(IOException e)
            {
      System.out.println("some io error");
            }
    catch(ArithmeticException e)
    {
    System.out.println("not divide by zero"+e);
    }
    catch(Exception e)
    {
    System.out.println("unknown exception");
    }
    System.out.println(k);

}
}
