interface Ab
{
    void show();
} 
interface yyy
{
}
interface XY extends Ab
{
    void show();
} 
public class Interface {
    public static void main(String[] args) 
    {
     Ab obj=() -> System.out.println("in show");  
     obj.show();
    }
}
