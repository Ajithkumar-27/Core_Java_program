import java.util.*;
class BinarySearch 
{
	public static void main(String[] args) 
	{
		int a[]={3,7,9,4,2,5,1};
		String res=find(a);
		System.out.println(res);
	}
	public static String find(int a[])
	{
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter element to search :");
		int n=sc.nextInt();
		int l=0;
		int h=a.length-1;
		while(l<=h)
		{
		int m=(l+h)/2;
		if (n==a[m])
		{
			return "Present at :"+m;
		}
		if (n<a[m])
		{
			h=m-1;
		}
		if (n>a[m])
		{
			l=m+1;
		}
		}
		return "Not Present";
	}
}
