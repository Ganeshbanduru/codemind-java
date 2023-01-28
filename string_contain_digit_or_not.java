import java.util.Scanner;
class Count{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String NUMBERS="0123456789";
        int c1=0;
        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(NUMBERS.contains(ch+"")){
                c1++;
            }
        
        }
        if(c1!=0)
            System.out.println("Contains"+" "+c1+" " +"digit");
        else     
            System.out.println("Doesn't contain"+" "+"digit");
    
    }
}