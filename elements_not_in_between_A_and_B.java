import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0,flag=0;
        int x[]=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        for(int i=0;i<n;i++){
            if(k>x[i] || x[i]>l){
                System.out.print(x[i]+" ");
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("-1");
        }
    }
}