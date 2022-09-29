package DsArray;

import java.util.Arrays;

public class BubbleSort {
	public void bubblesort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int swap=arr[j];//swap=98
					arr[j]=arr[j+1];//98=89
					arr[j+1]=swap;//89=swap
				}
			}
		}
	}

	public static void main(String[] args) {
		int array[]= {98,89,76,67,56,23,45,49,23};
		System.out.println("before sorting -"+Arrays.toString(array));
		BubbleSort obj=new BubbleSort();
		obj.bubblesort(array);
		System.out.println("After sorting-"+Arrays.toString(array));

	}

}
