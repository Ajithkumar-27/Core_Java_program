class AddValue 
{
	public static void main(String[] args) 
	{
		String str="sy23ed Tab43rez";
		int sum=0;
		for (int i=0; i<str.length();i++ )
		{
			if (str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				System.out.println(str.charAt(i));
				sum+=(str.charAt(i)-'0');
			}
		}
		System.out.println("total sum is :"+sum);
	}
}
