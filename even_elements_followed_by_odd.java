import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=0,o=0;
        int a[]=new int[n];
        int g[]=new int[n];
        int k[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int j=0;j<n;j++){
            if(a[j]%2==0){
                g[m]=a[j];
                m++;
            }
            else{
                k[o]=a[j];
                o++;
            }
        } 
        for(int j=0;j<m;j++){
            System.out.print(g[j]+" ");
            
        }for(int j=0;j<o;j++){
            System.out.print(k[j]+" ");
            
        }
        
        
    }
}