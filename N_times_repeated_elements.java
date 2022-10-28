import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0,flag=0;
        int x[]=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            count=1;
            if(x[i]!=-6666){
                for(int j=0;j<n;j++){
                    if(x[i]==x[j] && i!=j){
                        count++;
                        x[j]=-6666;
                    }
                }
            }
            if(count==k){
                System.out.print(x[i]+" ");
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("-1");
    }
}