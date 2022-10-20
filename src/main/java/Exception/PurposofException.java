package Exception;

import java.util.Scanner;

public class PurposofException {

	public static void main(String[] args) {
		String collect="i am thivin , from mettur";
		Scanner scan=new Scanner(System.in);
		try//condtion block
		{
			System.out.println("please tell us which index you want");
			System.out.println(collect.charAt(scan.nextInt()));
		}
		catch(StringIndexOutOfBoundsException str)//exception handeld block
		{
			System.out.println("index number should be less then "+collect.length());
			System.out.println(collect.charAt(scan.nextInt()));
		}
		finally
		{
			System.out.println("end of the code");
		}

	}

}
