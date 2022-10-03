package Oops.MultilevelInheritance;

public class MultilevelStudent extends MUltilevelEngineerStudent
{
	public void Student()
	{
		System.out.println("more then top students worked in IT companys");
	}

	public static void main(String[] args) {
		MultilevelStudent obj=new MultilevelStudent();
		obj.Student();
		obj.EngineerStudent();
		obj.ArtsStudent();
		

	}

}
