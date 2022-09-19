import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(i=0;i<n;i++)
            System.out.print(x[i]+" ");
        if(n%2==1)
            System.out.println('0');
    }
}