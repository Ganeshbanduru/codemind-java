import java.util.*;;
class concatenate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s=sc.nextLine();
        String s1=str+s;
        char a[]=s1.toCharArray();
        Arrays.sort(a);
        String ans=a.toString();
        System.out.println(a);
    }
}