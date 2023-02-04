import java.util.*;
class Neon {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sqr=num*num;
        int sum=0;
        while(sqr>0){
            int d=sqr%10;
            sqr/=10;
            sum+=d;
        }
        if(sum==num)
            System.out.println("Neon Number");
        
        else
            System.out.println("Not Neon Number");
    }
}