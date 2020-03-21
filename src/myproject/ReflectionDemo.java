package myproject;
import java.lang.reflect.Method;
public class ReflectionDemo {
    public static void main(String args[]) throws Exception
    {
     Class c=Class.forName("myproject.Test");
      Test t=(Test)c.newInstance();
      Method m=c.getDeclaredMethod("show",null);
      m.setAccessible(true);
      m.invoke(t,null);
    }
}
