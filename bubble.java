import java.util.*;
class Bubble 
{
	public static void main(String[] args) 
	{
		int a[]={3,1,7,5,9,4,2};
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
