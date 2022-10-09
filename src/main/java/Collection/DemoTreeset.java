package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeset {

	public static void main(String[] args) {
		TreeSet<MobilePhones> poorvika=new TreeSet<MobilePhones>();
		poorvika.add(new MobilePhones("vivo",8, 20000.98));
		poorvika.add(new MobilePhones("Samsung",6,15000.50));
		poorvika.add(new MobilePhones("apple",8,64000.45));
		poorvika.add(new MobilePhones("oppo",4,14000.00));
		poorvika.add(new MobilePhones("oneplus",6, 20000.98));
		MobilePhones obj=new MobilePhones("Mi",4, 15000.50);
		poorvika.add(obj);
		Iterator i=poorvika.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
class MobilePhones implements Comparable<MobilePhones>
{
	String mobilename;
	Integer ram;
	Double price;
	public String toString()
	{
		return "MobilePhones[mobilename=" + mobilename+",ram="+ ram+",price=" +price+"]";
	}
	public MobilePhones(String mobilename,Integer ram,Double price) 
	{
		super();
		this.mobilename=mobilename;
		this.ram=ram;
		this.price=price;
		
	}
	public int compareTo(MobilePhones o) 
	{
		
		return o.ram.compareTo(ram);
		//return this.price.compareTo(o.price);
	}
}
