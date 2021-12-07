package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long fact = scan.nextLong();
		long result = factorial(fact);
		System.out.println(result);		


	}
	public static long factorial(long a)
	{
		if(a == 0)
			return 0;
		
		long b = 1;
		for(long i = 1;i<=a;i++)
		{
			b *= i;
		}
		return b;
	}

}
