package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinerSearch {
	public static void main(String[] args)
	{
		BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array : ");
		int size;
		try {
			size = Integer.valueOf(read.readLine());
			int[] arry= new int[size];
			for(int i=0;i<size;i++)
			{
				arry[i]= Integer.valueOf(read.readLine());
			}
			System.out.println("Enter Search Element : ");
			int search= Integer.valueOf(read.readLine());
			search(arry,search);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void search(int[] arry, int search) {
		for(int i=0;i<arry.length;i++)
		{
			if(arry[i]==search)
			{
				System.out.println("item at index : "+i);
			}
		}
		
	}

}
