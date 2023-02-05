import java.util.*;
class Automorphic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        int sqrt=(int)Math.pow(num,2),i=0,k=0;
        while(num>0){
            i++;
            num/=10;
        }
        k=(int)Math.pow(10,i);
        num=0;
        while(sqrt>=0){
            int dig=sqrt%k;
            num+=dig;
            break;
        }
        if(num==num2)
            System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
        
    }
}