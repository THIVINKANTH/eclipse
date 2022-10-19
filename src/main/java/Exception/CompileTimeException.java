package Exception;

import java.io.IOException;

public class CompileTimeException {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Runtime run=Runtime.getRuntime();
		Process pro;
		pro=run.exec("notepad");
		Thread.sleep(5000);
		pro=run.exec("calc");
		
	}

}
//class base
//{
//	private base()//def constructer
//	{
//		
//	}
//	private static base obj=new base();
//	public static base getBase()
//	{
//		return obj;
//	}
//}
