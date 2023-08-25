import java.util.*;
public class Oostive{
    public static boolean Postive(int n){
        int r=0,c=0,flag=0;
            int k=n;
            while(k>0){
                r=k%10;
                c++;
                if(r==0)
                    break;
                else if(n%r==0)
                    flag++;
                k/=10;
            }
            if(flag==c){
                return true;
            }
            else 
                return false;
        
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++)
            if(Postive(i)==true)
                System.out.print(i+" ");
    }
}