import java.util.Scanner;
class sample{
    public static boolean IsPalindrom(int x){
        int t=x;
        int res=0;
        while(x>0){
            res=res*10+x%10;
            x/=10;
        }
        if(t==res){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,x[],i,cou=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(IsPalindrom(x[i])==true){
                cou++;
            } 
        }
        System.out.println(cou);
    }
}