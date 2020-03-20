public class Arguments {
    public static void main(String args[])
 {
     Display obj=new Display();
     obj.show(5);
 }
}
class Display
{
    public void show(int ... a)
    {
        for(int i:a)
        {
            System.out.println(i);
        }
    }
    public void show(int a)
    {
        
            System.out.println(a + " in show a");
      
    }
}
       
