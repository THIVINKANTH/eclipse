package MultipleInheritance;

public class Person implements Moveable,Speakable,Sleepable
{

	@Override
	public void sleep() 
	{
		System.out.println("minimum eight hours sleep is must");
		
	}

	@Override
	public void speak() 
	{
		System.out.println("speak is very important in all our life");
		
	}

	@Override
	public void move()
	{
		System.out.println("your human so move to any where");
		
	}

}
