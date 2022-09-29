package DsArray;

import java.util.Arrays;

public class BinearySearch {
	public int bineary(int arr1[],int low,int high,int key)
	{
		if(low<high)
		{
			int mid=(high+low)/2;
			if(arr1[mid]==key)
			{
				return mid;
			}
			else if(arr1[mid]>key)
			{
				return bineary(arr1,low,mid,key);
			}
			else if(arr1[mid]<key)
			{
				return bineary(arr1,mid+1,high,key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[]= {23,56,78,90,78,35,234,65,2,12};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		BinearySearch obj=new BinearySearch();
		int key=78;
		System.out.println(key+"founded by index of"+obj.bineary(array,0,array.length,key));

	}

}
