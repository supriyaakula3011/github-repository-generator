package Collections;
import java.util.ArrayList;
import java.util.Collection;
public class ArrayInt {
	public static void main(String args[]) {
		Collection<Integer> values = new ArrayList<>();
		values.add(3);
		values.add(88);
		values.add(99);
                values.add(66);
		values.add(77);
		values.add(55);
                values.remove(55);
                values.remove(66);
		for(int i: values)
		{
			System.out.println(i);
		}
	}
}