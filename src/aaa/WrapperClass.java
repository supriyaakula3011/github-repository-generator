package aaa;
import java.util.*;
public class WrapperClass {
     public static void main(String args[])
     {
         int i=3;
         Integer i1=new Integer(i);
         Integer j=i;
         int k=j.intValue();
         int l=j;
         ArrayList<Integer> value=new ArrayList<Integer>();
         value.add(3);
         value.add(4);
         value.add(5);
         value.add(6);
         value.add(9);
     System.out.println(value);
     }
}
