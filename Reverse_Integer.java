import java.util.*;
class ganesh{
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num,cou=0;
		num=sc.nextInt();
		int k=num;
		while(num!=0){
		    cou=cou*10+num%10;
		    num/=10;
		}
		System.out.println(cou);
    }
  }