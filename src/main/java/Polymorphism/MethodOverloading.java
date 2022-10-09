package Polymorphism;

public class MethodOverloading 
{
	public void calculate(int a,int b)
	{
		int c=a+b;
		System.out.println("c value is "+c);
	}
	public void calculate(int a,int b,int c)
	{
		int d=a-b-c;
		System.out.println("d value is"+d);
	}
	public void calculate(float a,float b)
	{
		float c=a*b;
		System.out.println("c value is "+c);
	}
	public void calculate()
	{
		System.out.println("it is normal calculate method to accessthe method overloading");
	}

	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		obj.calculate();
		obj.calculate(12,5);
		obj.calculate(67,7,6);
		obj.calculate(89.9f,9.98f);
	}

}
