package Oops.HybridInheritance;

public class Human extends Girl implements Bestiee,GirlLover
{
	public void Goodsoul()
	{
		System.out.println("Bad,Good");
	}

	public static void main(String[] args)
	{
		Human obj=new Human();
		obj.buildup();
		obj.Goodsoul();
		obj.lover();
		obj.girlbestiee();
	}

	
	public void lover() {
		System.out.println("pure love- tajmahal");

	}
	public void girlbestiee() 
	{
		System.out.println("Irritating Fellow");

	}

}
