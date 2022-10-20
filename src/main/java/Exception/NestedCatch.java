package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedCatch {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int clock=0,block=0;
		try
		{
			System.out.println("enter the first number");
			clock=scan.nextInt();
			System.out.println("enter the second number");
			block=scan.nextInt();
			System.out.println(clock/block);
		}
		catch(InputMismatchException exe)
		{
			System.out.println(exe);
			Scanner scans=new Scanner(System.in);
			try
			{
				System.out.println("only use by numeric numbers");
				System.out.println("enter the first number");
				clock=scans.nextInt();
				System.out.println("enter the second number");
				block=scans.nextInt();
				System.out.println(clock/block);
			}
			catch(ArithmeticException exe1)
			{
				System.out.println(exe1);
				System.out.println("can't be used by zero");
				System.out.println("enter the first number");
				clock=scans.nextInt();
				System.out.println("enter the second number");
				block=scans.nextInt();
				System.out.println(clock/block);
			}
		}

	}

}
