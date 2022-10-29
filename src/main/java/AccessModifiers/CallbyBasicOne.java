package AccessModifiers;

public class CallbyBasicOne {

	public static void main(String[] args)
	{
		BasicOne one=new BasicOne();
		one.sort();
		one.result();
		one.search(34.5);
		//one.sort1();--this is private modifier

	}

}
