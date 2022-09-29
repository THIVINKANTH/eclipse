package DsArray;

import java.util.Scanner;
public class LinearSearch {
	public int Isearch(int age1[],int key)
	{
		for(int i=0;i<age1.length;i++)
		{
			if(age1[i]==key)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int age[]= {1,3,5,6,21,77,22,25,98};
		Scanner scan=new Scanner(System.in);
		LinearSearch obj=new LinearSearch();
		System.out.println("witch number you want");
		int key=scan.nextInt();
		System.out.println(key+"your values is founded by"+obj.Isearch(age,key));
	}

}
