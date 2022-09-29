package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	 String a[]= {"thivin","pradeep","thilak","manoj"};
	 Task2 obj=new Task2();
	 obj.Updating(a);
	 for(String d :a )
	 {
		 System.out.println(d);
	 }
	 obj.Searching(a);
	}
	public void Updating(String b[])
	{
		System.out.println("before updating names"+Arrays.toString(b));
		Scanner s=new Scanner(System.in);
		System.out.println("what position to update");
		int p=s.nextInt();
		System.out.println("tell us your replace name");
		String name=s.next();
		b[p]=name;
		System.out.println("after updating values");
		
	}
	public void Searching(String c[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("whitch name you want");
		String name=scan.next();
		for(int i=0;i<c.length;i++)
		{
			if(name.equalsIgnoreCase(c[i]))
			{
				System.out.println(name+" "+"this name index is"+" "+i);
				return;
			}
		}
		System.out.println(name+" "+"not founded");
	}

}
