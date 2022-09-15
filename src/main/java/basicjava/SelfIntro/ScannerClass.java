package basicjava.SelfIntro;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the rollno");
		int a=s.nextInt();
		System.out.println(a);
		System.out.println("enter the total mark");
		int b=s.nextInt();
		System.out.println(b);

	}

}
