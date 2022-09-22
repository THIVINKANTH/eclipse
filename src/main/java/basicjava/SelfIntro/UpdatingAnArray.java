package basicjava.SelfIntro;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnArray {

	public static void main(String[] args) {
		String mobilenames[]= {"realme","redmi","oppo","samsung","apple","nokia"};
		Scanner obj=new Scanner(System.in);
		System.out.println("before updating a values"+Arrays.toString(mobilenames));
		System.out.println("please tell us what position to update");
		int pos=obj.nextInt();
		System.out.println("tell us your new value");
		String value=obj.next();
		mobilenames[pos]=value;
		System.out.println("after updating value");
		for(String mobile:mobilenames)
		{
			System.out.println(mobile+",");
		}

	}

}
