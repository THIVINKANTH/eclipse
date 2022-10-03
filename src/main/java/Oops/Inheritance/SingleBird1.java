package Oops.Inheritance;

public class SingleBird1 extends SingleBird2
{
	public void parrots()
	{
		System.out.println("parrots are green colour");
	}

	public static void main(String[] args) {
		SingleBird1 obj=new SingleBird1();
		obj.parrots();
		obj.peacock();

	}

}
