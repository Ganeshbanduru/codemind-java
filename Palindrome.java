import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,res=0;
        n=sc.nextInt();
        int t=n;
        while(n>0){
            r=n%10;
            res=res*10+r;
            n=n/10;
        }
        if(t==res){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}