package problems;

public class PairSum {

	public static void main(String[] args) {
		int[] arr= {12, 50, 10, 6, 40,39};
		int sum= findMaxSum(arr);
		System.out.println(sum);

	}

	private static int findMaxSum(int[] arr) {
		int max=0;
		int max2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<=arr[i])
			{
				max2=max;
				max=arr[i];
			}
			if(max2<arr[i] && arr[i]<max)
			{
				max2=arr[i];
			}
			
		}
		
		return max+max2;
	}

}
