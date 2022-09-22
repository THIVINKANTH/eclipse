package basicjava.SelfIntro;

import java.util.Scanner;

public class SearchingAnArray {
	public void Searching(int arr1[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("which number you want");
		int number=scan.nextInt();
		for(int pos=0;pos<arr1.length;pos++)
		{
			if(arr1[pos]==number)
			{
				System.out.println(number+"this number index is "+pos);
				return;
			}
			//System.out.println(number+"not founded");
		}
		System.out.println(number+"not founded");
     }

	public static void main(String[] args) {
		int arr[]= {1,2,3,45,6,7,99,87};
		SearchingAnArray obj=new SearchingAnArray();
		obj.Searching(arr);
		

	}

}
