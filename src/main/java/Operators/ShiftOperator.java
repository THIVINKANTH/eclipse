package Operators;

public class ShiftOperator {
// shift operator (>>)division, (<<)multiplication
	public static void main(String[] args) {
		int a=10;
		int b=5;
		System.out.println(a>>b);//[a/2^b]-->[10/2^5]->[10/32]
		System.out.println(a<<b);//[a*2^b]-->[10*2^5]->[10*32]

	}

}
