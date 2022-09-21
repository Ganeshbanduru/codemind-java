import java.util.Scanner;
class WaveArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,gani[],d=0,c=0;
        n=sc.nextInt();
        gani=new int[n];
        for(int i=0;i<n;i++)
            gani[i]=sc.nextInt();
        for(int i=0;i<n-2;i=i+2){
            if(gani[i]<gani[i+1] && gani[i+1]>gani[i+2])
                c=0;
            else{
                c=1;
                break;
            }
        }
        if(c==1){
            for(int j=0;j<n-2;j=j+2){
                if(gani[j]>gani[j+1] && gani[j+1]<gani[j+2])
                    d=0;
                else{
                    d=1;
                }
            }
        }
        if(d==0 || c==0) System.out.println("yes");
        else System.out.println("no");
    }
}