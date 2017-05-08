package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
	public static void main(String[] args)
	{
		BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array : ");
		int size;
		int start=0;
		try {
			size = Integer.valueOf(read.readLine());
			int[] arry= new int[size];
			System.out.println("Enter sorted elements : ");
			for(int i=0;i<size;i++)
			{
				arry[i]= Integer.valueOf(read.readLine());
			}
			System.out.println("Enter Search Element : ");
			int search= Integer.valueOf(read.readLine());
			
			search(arry,start,size, search);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

	private static void search(int[] arry, int start, int size, int search) {
		
		int mid=(size-1)/2;
		if(search==arry[mid])
		{
			System.out.println("found at index : "+mid);
		}
		else if(search<arry[mid])
		{
			size=mid;
			search(arry,start,size, search);
		}
		else
		{
			start=mid+1;
			search(arry,start,size, search);
		}
		
	}

}
