package Variables;

public class Variables1 {
	static int age= 23;// static variable

	public static void main(String[] args) {
		int a=10;//instance variable
		System.out.println(age);
		String mom="amma";
		System.out.println("my favoriate persion is:"+mom);
		System.out.println("this is instance variable:"+a);
		Variables1 obj= new Variables1();
		obj.task();
		obj.smart();

	}
	public void task()
	{
		String name ="thivinkanth";// local variable
		System.out.println("my name is :"+name);
		System.out.println(age);
	}
	public void smart()
	{
		System.out.println("java develpoer");
	}

}
