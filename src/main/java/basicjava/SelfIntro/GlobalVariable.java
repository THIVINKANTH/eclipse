package basicjava.SelfIntro;

public class GlobalVariable {
	int a =10;
   int b=20;
    public void display()
    {
    	System.out.println(a);
    	System.out.println(b);
    }

	public static void main(String[] args) {
		GlobalVariable obj=new GlobalVariable();
		obj.display();
	}
}
