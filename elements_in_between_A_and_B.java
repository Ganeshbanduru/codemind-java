import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,x[],i,m,n,cou=0;
        a=sc.nextInt();
        x=new int[a];
        for(i=0;i<a;i++)
            x[i]=sc.nextInt();
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=0;i<a;i++){
            if(x[i]>=m && x[i]<=n)
                cou+=1;
        }
        if(cou>1){
            for(i=0;i<a;i++){
                if(x[i]>=m && x[i]<=n){
                    System.out.print(x[i]+" ");
                }
            }
        }
        else
            System.out.println("-1");
            
    }
}