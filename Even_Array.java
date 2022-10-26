import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        int gani[]=new int[n];
        for(int i=0;i<n;i++)
            gani[i]=sc.nextInt();
        for(int j=0;j<n;j++){
            if(gani[j]%2==0){
                count++;
            }
        }
        if(count==n)
            System.out.println("True");
        else
            System.out.println("False");
         
    }
}