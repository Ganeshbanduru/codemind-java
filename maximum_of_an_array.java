import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        float sum=0;
        a=sc.nextInt();
        int gani[]=new int[a];
        for (int i=0;i<a;i++)
            gani[i]=sc.nextInt();
        int max=gani[0];
        for(int i=0;i<a;i++){
            if(gani[i]>max)
                max=gani[i];
        }
        System.out.println(max);
    }
}