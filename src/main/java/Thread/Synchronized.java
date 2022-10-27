package Thread;


class synch1
{
	synchronized public void printable(int add)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(add*i);
			try {
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) {
		       System.out.println(e);
			}
		}
	}
}

public class Synchronized {

	public static void main(String[] args) 
	{
	   final synch1 sy=new synch1();
	   Thread th =new Thread()
	   {
		   public void run()
		   {
			   sy.printable(5);
		   }
	   };
	   Thread th1=new Thread()
	   {
		   public void run()
		   {
			  sy.printable(7); 
		   }
	    };
	    th.start();
	    th1.start();

	}

}
