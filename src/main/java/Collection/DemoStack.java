package Collection;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) 
	{
		Stack list=new Stack();
		list.push("thivin");
		list.push('c');
		list.push(9514574679l);
		list.push(5.7f);
		System.out.println(list);
		list.pop();
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.empty());
		System.out.println(list.search('c'));
		
		
	}

}
