import java.util.Scanner;
class temperature{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cel;
        float fah=0;
        cel=sc.nextInt();
        fah=32+(float)(cel*(float)9/5);
        System.out.format("%.2f",fah);
    }
}