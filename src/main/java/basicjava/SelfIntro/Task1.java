package basicjava.SelfIntro;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number 1 to 3");
		int number=obj.nextInt();
		switch(number)
		{
		case 1:
			System.out.println("SHARPTRONICS");
			break;
		case 2:
			System.out.println("SATHYA");
			break;
		case 3:
		    System.out.println("DARLING");
		    break;
		default:
			System.out.println("today no offers");	
		}
		if(number==1)
		{
			System.out.println("Today 65% offer");
		}
		else if(number==2)
		{
			System.out.println("OLED 55% offer");
		}
		else if(number==3)
		{
			System.out.println("BUY ONE GET ONE OFFER ");
		}
		else
		{
			System.out.println("no offers");
		}

	}

}
