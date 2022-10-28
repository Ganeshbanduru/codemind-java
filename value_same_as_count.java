import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0,count1=0;
        int x[]=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
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
        if(x[i]==count)
            count1++;
        }
        System.out.println(count1);
    }
}