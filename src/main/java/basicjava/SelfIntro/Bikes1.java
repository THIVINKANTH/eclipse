package basicjava.SelfIntro;

import java.util.Scanner;

public class Bikes1 {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("WELCOME TO BIKES WORLD");
	System.out.println("Which is your Favorite company\n jawa\n yamaha\n pulsar\n");
	String company=obj.nextLine();
	switch(company)
	{
	case"jawa":
		System.out.println("welcome, thanks for choosing jawa ");
		System.out.println("this models are\n perak\n 42\n ");
		String models=obj.nextLine();
			switch(models)
			{
			case"perak":
				System.out.println("this model starting price at 209187 benifits\n ENGINE CC\r\n"
						+ "334 CC\r\n"
						+ "ENGINE TYPE\r\n"
						+ "SINGLE CYLINDER, FOUR STROKE, LIQUID COOLED, SI ENGINE, DOHC BSVI COMPLIANT\r\n"
						+ "MAX POWER\r\n"
						+ "30.64 PS\r\n"
						+ "MAX TORQUE\r\n"
						+ "32.74 NM\r\n"
						+ "FUEL SYSTEM\r\n"
						+ "ELECTRONIC FUEL INJECTION\r\n"
						+ "COMPRESSION\r\n"
						+ "11:01\r\n"
						+ "BORE STROKE\r\n"
						+ "81 X 65 MM\r\n"
						+ "EXHAUST\r\n"
						+ "TWIN EXHAUST");
				System.out.println("if you want to buy tell us your budget");
				int price=obj.nextInt();
				if(price>209187&&price<211000) 
				{
					System.out.println(price+"thank you for buying");
				}
				else
				{
					System.out.println("this model starting at 209187");
				}
				break;
			case"42":
				System.out.println("this model starting price at 194000 jawa 42 benifits\n CAPACITY\r\n"
						+ "293\r\n"
						+ "CC\r\n"
						+ "MAX POWER\r\n"
						+ "27\r\n"
						+ ".\r\n"
						+ "33\r\n"
						+ "PS\r\n"
						+ "MAX TORQUE\r\n"
						+ "27\r\n"
						+ ".\r\n"
						+ "0\r\n"
						+ "2\r\n"
						+ "NM\r\n"
						+ "WHEELBASE\r\n"
						+ "1369\r\n"
						+ "MM\r\n"
						+ "COMPRESSION\r\n"
						+ "11\r\n"
						+ ":\r\n"
						+ "1\r\n"
						+ "BORE STROKE\r\n"
						+ "76\r\n"
						+ "X\r\n"
						+ "65\r\n"
						+ "MM");
				System.out.println("if you want to buy tell us your budget");
				int price4=obj.nextInt();
				if(price4>194000&&price4<198000)
				{
					System.out.println(price4+"thank you for buying");
				}
				else
				{
					System.out.println("this model satring at 194000");
				}
				break;
				default:
					System.out.println("this models not available");
			}
		break;
	case"yamaha":
		System.out.println("welcome, thanks for choosing YAMAHA");
		System.out.println("whitch model you want\n r15 v4\n mt15");
		String price1=obj.nextLine();
			switch(price1)
			{
			case"r15 v4":
				System.out.println("this model price starting at 192000 R15 V4 benifits\n Engine155 cc\r\n"
						+ "Power18.4 PS\r\n"
						+ "Torque14.2 Nm\r\n"
						+ "BrakesDouble Disc\r\n"
						+ "Tyre TypeTubeless\r\n"
						+ "ABSDual Channel\r\n"
						+ "");
				System.out.println("if you want to buy tell us your budget");
				int price5=obj.nextInt();
				if(price5>192000&&price5<195000)
				{
					System.out.println(price5+"thank you for buying");
				}
				else
				{
					System.out.println("this model starting at 192000 ");
				}
				break;
			case"mt15":
				System.out.println("this model price starting at 165000 MT15 benifits\n Engine155 cc\r\n"
						+ "Power18.4 PS\r\n"
						+ "Torque14.1 Nm\r\n"
						+ "BrakesDouble Disc\r\n"
						+ "Tyre TypeTubeless\r\n"
						+ "ABSSingle Channel");
				System.out.println("if you want to buy tell us your budget");
				int price6=obj.nextInt();
				if(price6>165000&&price6<170000)
				{
					System.out.println(price6+"thank you for buyig");
				}
				else
				{
					System.out.println("this model starting price at 165000");
				}
				break;
				default:
					System.out.println("this model not available");
			}
		
		break;
	case"pulsar":
		System.out.println("available models are\n pulsar150\n ns200");
		String model=obj.nextLine();
		switch(model)
		{
		case"pulsar150":
			System.out.println("this model price starting at 115000 benifits\n ENGINE\r\n"
					+ "Type\r\n"
					+ "4-Stroke, 2-Valve, Twin Spark BSVI Compliant DTS-I FI Engine\r\n"
					+ "Displacement\r\n"
					+ "149.50 cc\r\n"
					+ "Max Power\r\n"
					+ "10.3 kW (14 PS) @ 8500 rpm\r\n"
					+ "Max Torque\r\n"
					+ "13.25 Nm @ 6500 rpm");
			System.out.println("if you want to buy tell us your budget");
			int price2=obj.nextInt();
			if(price2>115000&&price2<117000)
			{
				System.out.println(price2+"thank you for buying");
			}
			else
			{
				System.out.println("this model price starting at115000");
			}
			break;
		case"ns200":
			System.out.println("this model price starting at 141000 benifits\n ENGINE\r\n"
					+ "Type\r\n"
					+ "4-Stroke, SOHC 4-Valve, Liquid Cooled, Triple Spark, BSVI Compliant FI DTS-i Engine\r\n"
					+ "Displacement\r\n"
					+ "199.5 cc\r\n"
					+ "Max Power\r\n"
					+ "18 kW (24.5 PS) @ 9750 rpm\r\n"
					+ "Max Torque\r\n"
					+ "18.74 Nm @ 8000 rpm");
			System.out.println("if you want to buy tell us your budget");
			int price3=obj.nextInt();
			if(price3>141000&&price3<145000)
			{
				System.out.println(price3+"thank you for buying");
			}
			else
			{
				System.out.println("this model starting at 141000");
			}
			break;
			default:
				System.out.println("oops this model no stocks");
		}
		break;
	}
	}

}
