package Collection;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args)
	{
		HashMap<String ,Integer>obj= new HashMap<String,Integer>();
		obj.put("thivin",1);
		obj.put("thilak", 2);
		obj.put("pradeep",3);
		System.out.println(obj);
		System.out.println(obj.get("thivin"));
		System.out.println(obj.containsValue(3));
		System.out.println(obj.containsKey("thilak"));

	}

}
