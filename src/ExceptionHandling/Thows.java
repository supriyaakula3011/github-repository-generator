package ExceptionHandling;
  import java.io.*;
public class Thows {
    public static void main(String args[])
    {
        int j=1,k=0,i;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    i=8;
    try
    {
        System.out.println("enter a number");
    j=Integer.parseInt(br.readLine());
    k=i/j;
    if(k<10)
    {
        throw new ArithmeticException();
    }
    System.out.println("output : "+k);
    }
    catch(IOException e)
            {
      System.out.println("some io error");
            }
    catch(ArithmeticException e)
    {
    System.out.println("minimum value for the output is 10");
    }
    catch(Exception e)
    {
    System.out.println("unknown exception");
    }
    finally
    {
    System.out.println("Finally");
    }
    }
}
