package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class practice_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		for(int j = 0; j<a; j++)
		{
			for(int i = 0; i<b; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		scan.close();		
	}

}
