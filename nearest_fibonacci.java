import java.util.*;
 class Demo{
     public static boolean fabonacci(int n){
         int found=0,a=0,b=1,c;
         c=a+b;
         while(c<=n){
             if(c==n){
                 found=1;
                 break;
             }
             a=b;
             b=c;
             c=a+b;
         }
         if(found==1)
            return true;
        else 
            return false;
     }
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int h=0,l=0;
         for(int i=n+1;;i++){
             if(fabonacci(i)){
                 h=i;
                 break;
             }
         }
         for(int j=n-1;;j--){
             if(fabonacci(j)){
                 l=j;
                 break;
             }
         }
         if((n-l)==(h-n))
            System.out.println(l+" "+h);
        else if((n-l)>(h-n))
            System.out.println(h);
        else
            System.out.println(l);
     }
 }