import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,sum=0,n=0;
        a=sc.nextInt();
        int gani[]=new int[a];
        for (int i=0;i<a;i++){
            gani[i]=sc.nextInt();
            sum=sum+gani[i];
            n++;
        }
        int avg=sum/a;
        for(int i=0;i<a;i++){
            if(gani[i]==avg){
                System.out.println("True");
                System.exit(0);
            }
        }
        System.out.println("False");
    }
}