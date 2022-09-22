package basicjava.SelfIntro;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		//System.out.println(Arrays.toString(a));
		//System.out.println(a.length);
		for(int pos=0;pos<a.length;pos++)
		{
			System.out.println(a[pos]);
		}
		//for(int b: a)//for-each
		//{
			//System.out.println(b);
		//}

	}

}
