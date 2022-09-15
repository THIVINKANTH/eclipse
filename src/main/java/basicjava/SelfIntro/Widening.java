package basicjava.SelfIntro;

public class Widening {

	public static void main(String[] args) {
		// small to ->large
		//byte->short->char->int->long->float->double
		byte a=10;
		short b=a;
		int c=a;
		long d=a;
		float e=a;
		double f=a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}

}
