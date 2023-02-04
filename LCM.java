import java.util.Scanner;
class ganesh {
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	        int g=0;
	        for (int i=2;i<(1000*n1);i++) {
	        	if(i%n1==0 && i%n2==0) {
	        	    System.out.println(i);
	        		break;
	        	}
	        }
	}
}