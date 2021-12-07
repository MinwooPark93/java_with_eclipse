package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] var = new int[5];
		int [] var2 = new int[5];
		for(int i = 0;i<5;i++)
		{
			var[i] = scan.nextInt();
		}
		copyArray(var, var2);
		
		for(int i = 0;i<5;i++)
		{
			System.out.println(var2[i]);
		}
		

	}
	public static int[] copyArray(int []a, int []b) 
	{
		for(int i = 0;i<a.length;i++)
		{
			b[i] = a[i];
		}
		return b;//이를만 넣어이씨, 타입 상관 X
		
	}

}
