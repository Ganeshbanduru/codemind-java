import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        float sum=0;
        a=sc.nextInt();
        int gani[]=new int[a];
        for (int i=0;i<a;i++){
            gani[i]=sc.nextInt();
            sum=sum+gani[i];
        }
        float avg=(float)(sum/a);
        System.out.format("%.2f",avg);

    }
}