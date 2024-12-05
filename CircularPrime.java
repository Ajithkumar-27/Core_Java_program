import java.util.*;
public class CircularPrime 
{
    static Scanner sc=new Scanner(System.in);
    static boolean bool;
    static String s="197";
    static String res1="";
    static String res2="";
    public static boolean checkPrime(String str)
    {
        int n=Integer.valueOf(str);
        System.out.println(n);
        if(n<=1)
        {
        return false;
        }
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String [] args)
    {
    for(int i=0;i<s.length();i++)
    {
        if (i==0)
        {
            bool=checkPrime(s);
        }
        else
        {
            if (bool==true) 
            {
                res1="";res2="";
                for(int j=0;j<i;j++)
                {
                    res1+=s.charAt(j);
                }
                for(int k=i;k<s.length();k++)
                {
                     res2+= s.charAt(k);
                }
                res2=res2+res1;
                bool=checkPrime(res2);
            }
            else;
            break;
        }
    }
    if (bool==true) 
    {
        System.out.println("Circular Prime");
    }
    else
    System.out.println("Not a Circular Prime");
    }
}