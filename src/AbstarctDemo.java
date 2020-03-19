public class AbstarctDemo {
    public static void main(String[] args) 
    {
     Supriya obj=new Akula();
     obj.call();
     obj.walk();
     obj.play();
     obj.eat();
    }
}
abstract class Supriya
{
public void call()
{
    System.out.println("calling."); 
} 
public abstract void walk();
public abstract void play();
public abstract void eat();
}
abstract class San extends Supriya
{
    public void walk()
    {
    System.out.println("walking.");
    }
}
class Akula extends San
{
    public void play()
    {
    System.out.println("playing.");
    }
    public void eat()
    {
    System.out.println("eating.");
    }
}
