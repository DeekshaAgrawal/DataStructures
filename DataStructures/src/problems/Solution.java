package problems;

import java.util.Scanner;

class Solution{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		int max= Math.max(a, b);
		int min= Math.min(a, b);
		long maxLength=0;
		for(int n=min;n<=max;n++)
		{
			//long count= getMax(n);
			maxLength= Math.max(getMax(n), maxLength);
			//System.out.println(n+" "+count);
		}
		System.out.println("Max"+maxLength);
		
	}

	 static long getMax(int n) {
		if(n==1)
		{
			return 1;
		}
		long length= 1+getMax(nextNum(n));
		return length;
	}

	private static int nextNum(int n) {
		if(n%2==0)
		{
			return n/2;
		}
		else
			return n*3+1;
	}
}