import java.util.*;
class MergesortProgram
{
	public static void main(String[] args) 
	{
		int arr[]={9,4,8,1,6,3};
		System.out.println(Arrays.toString(arr));
		divide(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void divide(int a[],int l,int h)
	{
		if (l==h)
		{
			return;
		}
		int m=(l+h)/2;
		divide(a,l,m);
		divide(a,m+1,h);
		merge(a,l,m,h);
	}
	public static void merge(int []a,int l,int m,int h)
	{
		int left=l,right=m+1,x=0;
		int k[]=new int[a.length];
		while (left<=m &&right<=h)
		{
			if (a[left]<a[right])
			{
				k[x++]=a[left++];
			}
			else
				k[x++]=a[right++];
		}
		while (left<=m)
		{
			k[x++]=a[left++];
		}
		while (right<=h)
		{
			k[x++]=a[right++];
		}
		for (int i=l,y=0;i<=h ;i++ )
		{
			a[i]=k[y++];
		}
	}
}
