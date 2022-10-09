package Abstract;

public class AbstractConnection extends Operator
{

	public static void main(String[] args) {
		AbstractConnection obj=new AbstractConnection();
		obj.Types(89,9);
		obj.calculate(70,30);

	}
	public void calculate(int x, int y) {
		int a=x+y;
		System.out.println("a value is "+a);
		
	}

}
