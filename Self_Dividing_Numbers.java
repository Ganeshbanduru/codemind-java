import java.util.Scanner;
public class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,m,temp=0,c=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            c=0;
            sum=0;
            temp=i;
            while(temp>0)
            {
            int d=temp%10;
            c++;
            if( d==0)
            break;
            else if(i%d==0)
            sum++;
            temp/=10;
            }
            if(c==sum)
             System.out.print(i+" ");
        }
    }
}