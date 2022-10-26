import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0,avg=0,o=0;
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i:a)
            o=o+i;
        avg=o/n;
        for(int j:a){
            if(j<=avg)
                count++;
        }
            System.out.println(count);
        
        
    }
}