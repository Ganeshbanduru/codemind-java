import java.util.*;
class Add{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(),sum=0,r=0;
        if(k%9==0)
        System.out.println("0");
        else
        r=k%9;
        System.out.println(r);
    }
}