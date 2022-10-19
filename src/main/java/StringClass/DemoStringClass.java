package StringClass;

public class DemoStringClass {

	public static void main(String[] args) 
	{
		String name="thivinkanth";//literal
		String obj=new String("pradeep");//non literal
		name=name.concat("Divya");//immutable
		System.out.println(name);
		System.out.println(name.charAt(5));
		System.out.println(name.equals(obj));
		String connect="Thilak";
		String connect1="thilak";
		System.out.println(connect.compareTo(connect1));
		System.out.println(connect.endsWith("k"));
		System.out.println(name.replace("thivinkanth", "THIVIN"));
		String substr=name.substring(4);
		System.out.println(substr);
		System.out.println(substr.substring(7,12));
		System.out.println(name.contains("inkanthDivya"));
		System.out.println(name.length());
		String sentence=" i am thivin i have completed java full stack   ";
		System.out.println(sentence);
		sentence=sentence.trim();
		System.out.println(sentence);
		String result="i am thivin i have completed BCA . ";
		System.out.println(result);
		String result1[]=result.split(" ");
		for(String str: result1)
		{
			System.out.print(str);
		}
	

	}

}
