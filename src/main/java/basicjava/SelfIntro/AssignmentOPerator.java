package basicjava.SelfIntro;

public class AssignmentOPerator {
// +=, -=, *=, /=, %=
	public static void main(String[] args) {
		int a=5;
		int b=10;
	    b+=5;// b=b+5->b=10+5->b=15
		System.out.println(b);
		a-=2;// a=a-2->a=5-2->a=3
		System.out.println(a);
		b*=2;//b=b*2->b=15*2->b=30
		System.out.println(b);
		a/=2;//a=a/2->a=3/2->a=1.0
		System.out.println((float)a);
		b%=4;//b=b%2->b=30%2->b=2.0
		System.out.println((float)b);

	}

}
