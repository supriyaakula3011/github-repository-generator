package myproject;
class A1 extends Thread
{
    public void run()
    {
            for(int i=1;i<=5;i++)
            {
                System.out.println("thread1");
                try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {}
            }
    }
}
class H extends Thread
{
    public void run()
    {
            for(int i=1;i<=5;i++)
            {
                System.out.println("thread2");
                try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {}
    }
    }
}
public class ThreadDemo 
{
    public static void main(String args[])
    {
    A1 obj1=new A1();
    H obj2=new H();
    obj1.start();
    
    try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {}
    obj2.start();
   }
}
