import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,found=0;
        a=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for (int i=0;i<a;i++)
            arr.add(sc.nextInt());
        int n=sc.nextInt();
        for(int i:arr){
            if(arr.contains(n)){
                found=1;
            }
        }
        if(found==1)
            System.out.println("True");
        else
            System.out.println("False");
            
    }
}