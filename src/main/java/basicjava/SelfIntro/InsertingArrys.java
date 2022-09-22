package basicjava.SelfIntro;

import java.util.Scanner;

public class InsertingArrys {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String name[]=new String[10];
		for(int i=0;i<name.length;i++)//i+=2
		{
			System.out.println("what is your name");
			name[i]=obj.nextLine();
		}
		for(int i=0;i<name.length;i++)
		{
			//if(name[i]!=null)
			//System.out.println(name[i]);
			System.out.println(name[i]);
		}

	}

}
