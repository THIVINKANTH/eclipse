package Task;
import java.util.Scanner;

public class tsak {
	static String a="INCOME TAX DEPARTMENT";

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("enter permanent account number card");
		String num=obj.nextLine();
		System.out.println("enter your name");
		String name=obj.nextLine();
		System.out.println("enter your father name ");
		String n1=obj.nextLine();
		System.out.println("enter your date of birth");
		String d=obj.next();
		System.out.println(a);
		System.out.println("PAN NUMBER\n "+num);
		System.out.println("NAME\n "+name);
		System.out.println("FATHER NAME\n "+n1);
		System.out.println("DATE OF BIRTH\n "+d);
		
		

	}

}
