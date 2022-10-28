import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        int x[]=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            sum=sum+x[i];
        }
        System.out.println(sum);
    }
}