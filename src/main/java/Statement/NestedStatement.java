package Statement;

public class NestedStatement {

	public static void main(String[] args) {
		char a='1';
		char b='2';
		if(a<=b)
		{
			if(a==b)
			{
				System.out.println("a and b is equal");
			}
			else
			{
				System.out.println("a and b is not equal");
			}
		}
		else
		{
			System.out.println("empty");
		}

	}

}
