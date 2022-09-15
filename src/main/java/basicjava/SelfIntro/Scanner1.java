package basicjava.SelfIntro;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your school name");
		String name=obj.nextLine();// String nextLine() for using paragraph space text
		System.out.println("Enter your name");
		String n=obj.next();//String next() for using without space
		System.out.println("enter your age");
		int a=obj.nextInt();
		System.out.println("enter your 10 mark");
		int m=obj.nextInt();
		System.out.println("enter your 12 mark");
		int m1=obj.nextInt();
		System.out.println("enter your 10 persentage");
		float p=obj.nextFloat();
		System.out.println("enter your 12 persentage");
		float p1=obj.nextFloat();
		System.out.println(name);
		System.out.println(n);
		System.out.println(a);
		System.out.println(m);
		System.out.println(m1);
		System.out.println(p);
		System.out.println(p1);
	}
}
