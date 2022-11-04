import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.next();
        int count=0;
        int total=s1.length();
        int replace=s1.replace(s2,"").length();
        count=total-replace;
        if(count==0)
            System.out.println(-1);
        else
            System.out.println(count);
    }

}