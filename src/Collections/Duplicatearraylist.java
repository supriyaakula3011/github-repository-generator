package Collections;
import java.util.*;
public class Duplicatearraylist {
	public static void main(String args[]) {
              ArrayList<String> names = new ArrayList<>();
		names.add("GIET");
		names.add("MASTEK");
		names.add("mastek");
		names.add("supriya");
		names.add("mastek");
		names.add("mastek");
                Set<String> s=new HashSet<>();		
		for(String name: names)
		{
                        if(s.add(name)==false)
			System.out.println(name);
		}		
	}
}

