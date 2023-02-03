import java.util.*;
class Prefect_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(),sum=1;
        for(int i=2;i<=(k/2);i++){
            if(k%i==0){
                sum+=i;
            }
        }
        if(sum==k)
        System.out.println("True");
        else
        System.out.println("False");
        
    }
}