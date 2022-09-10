import java.util.*;
class main{
	public static int revDigit(int num)
	{
		int rev = 0;
		while (num > 0)
		{
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}

	public static int square(int num)
	{
		return (num * num);
	}
	static boolean checkAdamNumber(int num)
	{
		int a = square(num);
		int b = square(revDigit(num));
		if (a == revDigit(b)){
		return true;
		}
		else{
		return false;	
	}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if (checkAdamNumber(num))
		System.out.println("True");
		else
		System.out.println("False");
	}

}
