package nonAccessModifiers;

public class DemoFinal 
{
	static int a=12;
	final int b=10;
	public static void thivin(int a)
	{
		System.out.println(a);
	}
	final void Divya()
	{
		System.out.println(b);
	}
	public void display()
	{
		System.out.println("i'm not static method");
	}

	public static void main(String[] args) 
	{
		DemoFinal obj=new DemoFinal();
		thivin(5799);
		obj.display();
		obj.Divya();
		System.out.println(a);

	}

}
