package StringClass;

public class DemoStringBuffer {

	public static void main(String[] args) 
	{
		StringBuffer buff=new StringBuffer("hello");
		buff.append("world");//helloworld
		System.out.println(buff);
		buff.insert(10,"thivin");//helloworldthivin
		System.out.println(buff);
		buff.replace(1, 5, "divya");//hdivyaworldthivin
		System.out.println(buff);
		buff.delete(0, 6);
		System.out.println(buff);//worldthivin
		buff.reverse();
		System.out.println(buff);//nivihtdlrow
		

	}

}
