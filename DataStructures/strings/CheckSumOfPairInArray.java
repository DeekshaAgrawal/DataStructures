package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckSumOfPairInArray {

	public static void main(String[] args) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("No. of passes :");
			int p=Integer.valueOf(read.readLine());
			while(p>0)
			{
				System.out.println("Size of array : ");
				int size=Integer.valueOf(read.readLine());
				System.out.println("No. to compare the sum : ");
				int key= Integer.valueOf(read.readLine());
				int[] arr=new int[size];
				boolean flag=false;
				System.out.println("Array elements : ");
				for(int i=0;i<size;i++)
				{
					arr[i]=Integer.valueOf(read.readLine());
				}
				outerLoop:
				for(int i=0;i<size-1;i++)
				{
					for(int j=i+1;j<size;j++)
					{
						if(arr[i]+arr[j]==key)
						{
							System.out.println("YES");
							flag=true;
							break outerLoop;
						}
					}
				}
				if(!flag)
				{
					System.out.println("NO");
				}
				p--;
			}
		}catch(NumberFormatException | IOException e )
		{
			System.out.println("sdasd");
			e.printStackTrace();
		}

	}

}
