package Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class GenericDemo {
	public static void main(String args[]) {
		Collection values = new ArrayList();
		values.add(3);
		values.add("mastek");
		values.add(5.8f);
		Iterator i=values.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());		
	}
}
