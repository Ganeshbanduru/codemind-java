import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        ArrayList<Integer>arr = new ArrayList<Integer>();
        ArrayList<Integer>ans = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        for(int i : arr){
            if(!ans.contains(i)){
                if(i%2!=0){
                    sum+=i;
                    ans.add(i);
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}