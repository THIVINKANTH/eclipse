package Exception;

import java.util.Scanner;

public class FiniteChances 
{
	private String currentdata="i am thivin from mettur";
	Scanner scan=new Scanner (System.in);
	public void extract(int attempts)
	{
		try
		{
			System.out.println("enter the first index of");
			int start=scan.nextInt();
			System.out.println("enter the second index of");
			int end=scan.nextInt();
			System.out.println(currentdata.substring(start, end));
		}
		catch(StringIndexOutOfBoundsException exe)
		{
			System.out.println(exe);
			System.out.println("start with 0 end in "+currentdata.length());
			if(attempts<3)
			{
				attempts++;
				extract(attempts);
			}
			else
			{
				System.out.println("max attempts reached");
			}
		}
	}

	public static void main(String[] args)
	{
		FiniteChances chance=new FiniteChances();
		chance.extract(1);

	}

}
