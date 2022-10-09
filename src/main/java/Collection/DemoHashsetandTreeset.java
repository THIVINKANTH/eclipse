package Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoHashsetandTreeset {

	public static void main(String[] args) {
		HashSet<Integer> obj=new HashSet<Integer>();
		obj.add(57);
		obj.add(12);
		obj.add(99);
		obj.add(5799);
		obj.add(1299);
		System.out.println("Hashset values "+obj);
		TreeSet<Integer> obj1=new TreeSet<Integer>();
		obj1.addAll(obj);
		System.out.println("Treeset values "+obj1);

	}

}
