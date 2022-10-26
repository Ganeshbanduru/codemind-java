import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        int gani[]=new int[n];
        for(int i=0;i<n;i++)
            gani[i]=sc.nextInt();
        for(int j=1;j<n-1;j++){
            if(gani[j]%2==0 && gani[j-1]%2!=0 && gani[j+1]%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}