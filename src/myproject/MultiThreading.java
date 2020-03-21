package myproject;
class P implements Runnable
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
class Q implements Runnable
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
public class MultiThreading 
{
    public static void main(String args[])
    {
    Runnable obj1=new P();
    Runnable obj2=new Q();
    Thread t1=new Thread(obj1);
    Thread t2=new Thread(obj2);
    t1.start();
          try
                {
                Thread.sleep(1000);
                }
                catch(Exception e)
                {}
    t2.start();
   }
}

