class PrimeSums 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int arr[]={3,1,5,7,5,8,6};
		
		for(int i=0;i<arr.length;i++ )
		{
			int count=0;
			for(int j=1;j<=arr[i] ;j++){
				if (arr[i]%j==0)
				{
					count++;
				}
			}
			if(count == 2){
				sum+=arr[i];
			}
		}
		System.out.println("Prime sum is :"+sum);
	}
}
