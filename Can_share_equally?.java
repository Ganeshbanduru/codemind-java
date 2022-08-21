import java.util.*;
class pandemic
{
    public static void main(String args[])
    {
        int h,b;
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        b=sc.nextInt();
        if(b+h>0){
            if(h%2==0 && (h>0 || b%2==0))
            {
                System.out.println("YES");
            }
       
            else
            {
                System.out.println("NO");
            }
        }
        else
            System.out.println("NO");
    }   
}