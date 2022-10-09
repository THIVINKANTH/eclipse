package Polymorphism;

public class MethodOverRiding2 
{
	public void calculate(double a,double b)
	{
		double c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		MethodOverRiding2 obj=new MethodOverRiding2();
		obj.calculate(98, 78);
		MethodOverRiding1 obj1=new MethodOverRiding1();
		obj1.calculate(56,67);
		//upcasting--reference by a parant class but object are created by child class
//		MethodOverRiding1 obj2=new MethodOverRiding2();
//		obj2.calculate(89,98);

	}

}
