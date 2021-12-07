package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class practice_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a [] = new int[5];
		int max = 0;
		for(int i = 0;i<5;i++)
		{
			a[i] = scan.nextInt();
			max = Integer.MIN_VALUE;
			if(a[i] > max)
				max = a[i];
		}
		System.out.println(max);
		
		
		scan.close();

	}

}
