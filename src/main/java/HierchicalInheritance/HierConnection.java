package HierchicalInheritance;

public class HierConnection {
	public void connect()
	{
		System.out.println("connected with hierchical inheritance");
	}

	public static void main(String[] args) {
	HierConnection obj=new HierConnection();
	obj.connect();
	Teacher obj1=new Teacher();
	obj1.base();
	obj1.child1();
	Student obj2=new Student();
	obj2.child2();

	}

}
