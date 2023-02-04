import java.util.*;
class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(),sum=0;
        for(int i=2;i<=Math.sqrt(k);i++){
            if(k%i==0){
                sum+=i+k/i;
            }
        }
        sum++;
        if(sum==k && k!=1){
            System.out.println("True");
        }
        else
        System.out.println("False");
    }
}