import java.util.*;
 class array{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt(),flag=0;
         int x[]=new int[n];
         for(int i=0;i<n;i++)
             x[i]=sc.nextInt();
         int k=sc.nextInt();
         int l=sc.nextInt();
         int min=9999;
         for(int i=0;i<n;i++){
             if(x[i]>=k && x[i]<l){
                 if(x[i]<min)
                    min=x[i];
                    flag=1;
             }
         }
         if(flag==1)
            System.out.println(min);
        else System.out.println(-1);
         
     }
 }