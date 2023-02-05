import java.util.*;
class Pronic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int found=0;
        for(int i=0;i<=Math.sqrt(num);i++){
            int res=i*(i+1);
            if(num==res){
                found=1;
                break;
            }
            }
            if(found==1){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }