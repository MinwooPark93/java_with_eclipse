package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class practice_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		scan.close();
	}

}