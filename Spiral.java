class Spiral 
{
	public static void main(String[] args) 
	{
		int [][]arr={
			{7,3,6,3,2,9},
			{0,2,7,5,9,3},
			{8,3,9,2,7,1},
			{0,2,7,5,9,3}
		};
		int left=0,right=5,top=0,bottom=3;
		while (left<=right && top<=bottom)
		{
			for (int i=left;i<=right;i++ )
			{
				System.out.print(arr[top][i]+" ");
			}
			top++;
			
			for (int i=top;i<=bottom ;i++)
			{
				System.out.print(arr[i][right]+" ");
			}
			right--;
		
			for (int i=right;i>=left ;i-- )
			{
				System.out.print(arr[bottom][i]+" ");
			}
			bottom--;
			
			for (int i=bottom;i>=top ;i-- )
			{
				System.out.print(arr[i][left]+" ");
			}
			left++;
		}
	}
}
