package Thread;

import java.util.Arrays;

public class MultiThreading {

	public static void main(String[] args) 
	{
		Binary by=new Binary();
		Thread th=new Thread(by,"thivinkanth");
		Thread th1=new Thread(by,"pradeep");
		Thread th2=new Thread(by,"thilak");
		th2.setPriority(10);
		th.start();
		th1.start();
		th2.start();
	}

}
class Binary implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getId());
		listing();
		searching();
	}
	private int arr[]= {12,43,45,64,23,56,54,23,24};
	public void listing()
	{
		System.out.println(Arrays.toString(arr));
	}
	public void searching()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
							
				}
			}
		}
			
	}
}
