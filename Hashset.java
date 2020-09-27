package Collections;
import java.util.*;
public class Hashset {
	public static void main(String args[]) {
		Set<Integer> values = new HashSet<>();
		values.add(3);
		values.add(88);
		values.add(99);
                values.add(66);
		values.add(77);
		values.add(55);
                values.add(55);
                
                
		
		for(int i: values)
		{
			System.out.println(i);
		}

		
	}

}
