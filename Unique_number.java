import java.util.*;
class unique{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num,rem=0,c,t,r,flag=0;
        while(temp!=0){
            rem=temp%10;
            c=0;
            t=num;
            while(t!=0){
                r=t%10;
                if(r==rem){
                    c++;
                }
                if(c>1){
                    flag=1;
                    break;
                }
                t/=10;
            }
            temp/=10;
        }
        if(flag==0)
            System.out.println("Unique Number");
        else
            System.out.println("Not Unique Number");
    }
}