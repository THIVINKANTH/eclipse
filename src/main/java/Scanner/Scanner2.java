package Scanner;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the a value");
		int a=obj.nextInt();
		System.out.println("enter the b value");
		int b=obj.nextInt();
		System.out.println("enter the c value");
		int c=obj.nextInt();
		/*int d=a+b+c;
		int e=c-b;
		int f=a*b;
		float g=b/a;
		float h=b%a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		System.out.println(a+b+c);
		System.out.println(c-b);
		System.out.println(a*b);
		System.out.println((float)b/a);
		System.out.println((float)b%a);
	}

}
