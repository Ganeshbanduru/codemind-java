import java.util.Scanner;
class ganesh {
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int k=sc.nextInt(),res=0;
	        int sum =0;
	        int num=k,idx=0,i=0;
	        while(num>0) {
	        	i++;
	        	int d=num%10;
	        	num=num/10;
	        	if(d==6) {
	        		idx=i;
	        	}
	        }
	        i=0;
	        num=k;
	        while(num>0){
	        	i++;
	        	int d=num%10;
	        	num=num/10;
	        	if(i==idx){
	        		d=9;
	        	}
	        	res+=d*(Math.pow(10, i-1));
	        }
	        System.out.println(res);
	}
}