package Collections;
import java.util.*;
public class List {
	public static void main(String args[]) {
		ArrayList<Integer> values = new ArrayList<>();
		values.add(3);
		values.add(88);
		values.add(99);
		values.add(66);
		values.add(22);
		values.add(11);
		Collections.sort(values);
		for(int i: values)
		{
			System.out.println(i);
		}		
	}
}
