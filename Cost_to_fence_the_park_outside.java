import java.util.*;
public class Fence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int w=sc.nextInt();
        int c=sc.nextInt();
        int sum=c*((l+(2*w))*(b+(2*w))-(l*b));
        System.out.println(sum);
        }
}