import java.util.*;
class LastSum 
{
	public static void main(String[] args) 
	{
		int a[]={34,76,2,45,87,23,98,23};
		System.out.println(Arrays.toString(a));
		int []res=new int[a.length];
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			//int num=a[i];
			while (a[i]>0)//32
			{
				if (a[i]<=9)//32<10
				{
					res[i]=a[i];
					sum=sum+a[i];
				}
				a[i]=a[i]/10;
			}
		}
		System.out.println(Arrays.toString(res));
		System.out.println("Total sum is :"+sum);
	}
}
