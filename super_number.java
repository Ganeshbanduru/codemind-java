import java.util.*;
class array{
    public static int issum(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    public static boolean isPrime(int n){
        if(n<2)
            return false;
        for(int i=2;i<(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int Factor(int n){
        int i,sum=0;
        for(i=2;i<=n;i++){
            while(n%i==0){
                if(isPrime(i)){
                    sum=sum+issum(i);
                    n=n/i;
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=issum(n);
        int b=Factor(n);
        if(a==b){
            System.out.println("1");
        }
        else
        System.out.println(0);
    }
}