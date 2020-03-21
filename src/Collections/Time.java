package Collections;
import java.util.*;
public class Time {
	public static void main(String args[]) {
              long start=System.currentTimeMillis();
		ArrayList a = new ArrayList();
		
		
		
		for(int i=1;i<=1000000;i++)
		{
                        a.add(i);
		}
              long end=System.currentTimeMillis();
              System.out.println(end - start);	
	}
}

