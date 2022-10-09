package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
	  LinkedList list= new LinkedList();// Generic
	  LinkedList<String>list1=new LinkedList<String>();// non-Generic
	  list1.add("thivinkanth");
	  list1.add("Divya");
	  list1.add("Thiya");
	  Iterator i=list1.iterator();
	  while(i.hasNext())
	  {
		  System.out.println(i.next());
	  }
	  list.add("thivinkanth");
	  list.add('c');
	  list.add(24);
	  list.addFirst(9514594679l);//will be added first
	  list.add(4.5f);
	  list.add(3,23);//add index,object
	  list.remove(2);
	  System.out.println(list);
	  System.out.println(list.contains("thivinkanth"));//condition checking
	  list.set(1,"Divya");//its update a object
	  list.add("Divya");
	  System.out.println(list);
	  list.clear();//deleted all elements
	  System.out.println(list);
	  System.out.println(list1.get(0));//get a value
	  System.out.println(list1.indexOf("thivin"));//get a index
	  
	}

}
