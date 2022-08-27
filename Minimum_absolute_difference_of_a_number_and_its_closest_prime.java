import java.util.*;
class prime
{
    public static boolean isPrime(int n)
    {
        int c=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		int n,d1=0,d2=0;
		n=sc.nextInt();
		for(int i=n; ;i--)
		{
		    if(isPrime(i))
		    {
		        d1=i;
			    break;
		    }
		}
		for(int i=n; ;i++)
		{
		    if(isPrime(i))
		    {
		        d2=i;
			    break;
		    }
		}
		if((n-d1)<=(d2-n))
		{
		    System.out.println(n-d1);
		}
		else
		{
		    System.out.println(d2-n);
		}
    }
}