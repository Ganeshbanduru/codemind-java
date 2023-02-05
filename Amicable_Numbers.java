import java.util.*;
class Amicable{
    public static int amicable(int n){
        int sum=1,found=0;
        for(int i=2;i<=(n/2);i++){
            found=1;
            if(n%i==0)
                sum+=i;
        }
            return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),res1=amicable(num1);
        int num2=sc.nextInt(),res2=amicable(num2);
        if(num1==res2 && num2==res1)
            System.out.println("Amicable");
        else
            System.out.println("Not Amicable");
    }
}