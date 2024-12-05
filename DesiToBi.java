class DesiToBi 
{
	public static void main(String[] args) 
	{
		String s="1101";
		int arr[]={8,4,2,1};
		int count=0,sum=0;
		for (int i=0;i<s.length() ;i++ )
		{
			if (s.charAt(i)=='1')
			{
				count++;
			}
			sum+=arr[i]*(s.charAt(i)-'0');
		}
			System.out.println("Total count is: "+count);
		System.out.println("Total sum is: "+sum);
	}
}
