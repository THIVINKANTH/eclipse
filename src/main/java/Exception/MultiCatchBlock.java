package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchBlock {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int clock=0;
		int block=0;
		try
		{
			System.out.println("enter the first number ");
			clock=scan.nextInt();
			System.out.println("enter the second number");
			block=scan.nextInt();
			System.out.println(clock/block);
		}
		catch(ArithmeticException exe)
		{
			System.out.println("can't be used by zero");
			block=scan.nextInt();
			System.out.println(clock/block);
		}
		catch(InputMismatchException exe1)
		{
			Scanner scans=new Scanner(System.in);
			System.out.println("only used by numeric numbers");
			clock=scans.nextInt();
			block=scans.nextInt();
			System.out.println(clock/block);
		}

	}

}
