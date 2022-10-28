import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0,count1=0,sum=0,found=0;
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
        if(x[i]==count){
            sum=sum+x[i];
            count1++;
            found=1;
            }
        }
        float avg=(float)sum/count1;
        if(found==1)
        System.out.format("%.2f",avg);
        else
            System.out.println("-1");
        
        
    }
}
