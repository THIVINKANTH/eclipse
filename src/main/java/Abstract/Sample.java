package Abstract;

public class Sample extends Operator
{

	public static void main(String[] args) 
	{
		Sample obj=new Sample();
		obj.Types(89, 9);
		obj.calculate(10, 5);
		

	}

	
	public void calculate(int x, int y)
	{
		int a=x*y;
		System.out.println("a value is "+a);
		
		
	}

}
