package basicjava.SelfIntro;

public class MethodObject1 {
public int add()
{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
	return 0;
}
public float add1()
{
	int a=20;
	float b=10.5f;
	float c=a+b;
	System.out.println(c);
	return 0;
}
public double add2()
{
	int a=10;
	double b=10.5;
	System.out.println(a+b);
	return 0;
}

	public static void main(String[] args) {
	MethodObject1 a= new MethodObject1();
	a.add();
	a.add1();
	a.add2();
	}

}
