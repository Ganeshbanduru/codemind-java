import java.util.*;
class Spy {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pro=1,sum=0;
        while(num>0){
            int d=num%10;
            num/=10;
            pro*=d;
            sum+=d;
        }
        if(sum==pro)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}