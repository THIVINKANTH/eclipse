package AccessModifiers;

import java.util.Arrays;

public class BasicOne
{
	private double hey[]= {1.2,34.5,456.4,4.4,34.34,8.9,87.2};
	public void result()
	{
		for(double hey1:hey)
		{
			System.out.println(hey1);
		}
	}
	void search(double data)
	{
		for(int i=0;i<hey.length;i++)
		{
			if(hey[i]==data)
			{
				System.out.println(data+"found @"+i);
				return;
			}
		}
	}
	protected void sort()
	{
		Arrays.sort(hey);
		System.out.println(Arrays.toString(hey));
	}
	private void sort1()
	{
		Arrays.sort(hey);
		System.out.println(Arrays.toString(hey));
	}

}
