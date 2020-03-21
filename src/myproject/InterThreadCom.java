package myproject;
class Count
{
    int n;
    boolean valueSet=false;
    public synchronized void put(int n)
    {
        while(valueSet)
        {
            try { wait(); }
            catch(Exception e){}
        }
        System.out.println("Put :" +n);
        this.n=n;
        valueSet=true;
        notify();
    }
    public synchronized void get()
    {
        while(!valueSet)
        {
            try { wait(); }
            catch(Exception e){}
        }
            System.out.println("Get :"+n);
            valueSet=false;
            notify();
    }
}
class Producer implements Runnable
{
    Count a;

    public Producer(Count a) {
        this.a = a;
        Thread t=new Thread(this,"Producer");
        t.start();
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            a.put(i++);
            try { Thread.sleep(1000); } catch(Exception e){}
        }
    }
}
class Consumer implements Runnable
{
    Count a;
    public Consumer(Count a) {
        this.a=a;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }
    public void run()
    {
     while(true)
        {
            a.get();
            try { Thread.sleep(1000); } catch(Exception e){}
        }   
    }
}
public class InterThreadCom
{
    public static void main(String args[])
    {
        Count a=new Count();
        new Producer(a);
        new Consumer(a);
    }
}