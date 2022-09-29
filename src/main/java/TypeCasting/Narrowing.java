package TypeCasting;

public class Narrowing {

	public static void main(String[] args) {
		// large to ->small
		// double->float->long->int->char->short->byte
		double a=10.8;
		float b=(float)a;
		System.out.println(a);
		System.out.println(b);
		System.out.println((long)a);
		System.out.println((int)a);
		System.out.println((short)a);
		System.out.println((byte)a);

	}

}
