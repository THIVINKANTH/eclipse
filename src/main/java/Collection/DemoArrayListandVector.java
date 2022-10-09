package Collection;

import java.util.ArrayList;
import java.util.Vector;

public class DemoArrayListandVector {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add("thivin");
		obj.add(5799);
		obj.add(9514594679l);
		obj.add(57.99f);
		obj.add(true);
		//System.out.println("Before retained values"+obj);
		Vector obj1=new Vector();
		obj1.add("thivin");
		obj1.add(5799);
		obj1.add(9514594679l);
		obj1.addAll(obj);
		obj1.add(1210);
		System.out.println("Arraylist values"+obj);
		System.out.println("Vector values"+obj1);
		obj1.removeAll(obj);
	    System.out.println("removed values"+obj1);
		obj.retainAll(obj1);
		System.out.println("retained values"+obj1);

	}

}
