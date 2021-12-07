package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int total = sum(input);
		
		System.out.println(total);
	}
	public static int sum(int a)
	{
		int b = 0; 
		for(int i = 1;i<=a;i++)
		{
			b += i;
		}
		return b;
	}

}
