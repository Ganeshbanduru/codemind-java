import java.util.Scanner;
class Sample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,len,q,q1,d;
		n=sc.nextInt();
		d=sc.nextInt();
		len=(int)Math.log10(n)+1;
		q=n%(int)Math.pow(10,d);
		q1=n/(int)Math.pow(10,len-d);
		System.out.println(Math.abs(q-q1));
		
	}
}			