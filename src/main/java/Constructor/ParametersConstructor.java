package Constructor;

public class ParametersConstructor 
{
	String name;
	int age;
	public ParametersConstructor(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("my name is "+name+"\n my age is "+age);
	}

	public static void main(String[] args) 
	{
		ParametersConstructor obj=new ParametersConstructor("thivin", 24);

	}

}
