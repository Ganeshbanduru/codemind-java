import java.util.*;
class Simple
{
    public static void main(String args[])
    {
        int n;
        String custmerid,name;
        Scanner sc=new Scanner(System.in);
        custmerid=sc.nextLine();
        name=sc.nextLine();
        n=sc.nextInt();
        float b;
        if(n<=199)
        {
            b=n*1.20f;
        }
        else if(n>=200 && n<400)
        {
            b=n*1.50f;
        }
        else if(n>=400 && n<600)
        {
            b=n*1.80f;
        }
        else
        b=n*2.00f;
        if(b>400)
        {
            b=b*0.15f+b;
        }
        else
        b=b+100;
        System.out.format("%.2f",b);
        sc.close();
    }
}