
class Tables
{
	public static void main(String args[])throws Exception
	{
		for (int i=1; i<=1; i++)
		{
			for (int j=1; j<=10 ;j++ )
			{
				System.out.println((i+1)+"x"+j+"="+(i+1)*j
									+"\t\t"+(i+2)+"x"+j+"="+(i+2)*j
									+"\t\t"+(i+3)+"x"+j+"="+(i+3)*j
									+"\t\t"+(i+4)+"x"+j+"="+(i+4)*j);
				Thread.sleep(1000);
				
			}
		}
		System.out.println("\t\t*********************");
		
	}
}

