package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("가로는?");
		int h = scan.nextInt();
		System.out.print("세로는?");
		int v = scan.nextInt();
		
		draw(h, v);
		

	}
	public static void draw(int h, int v)
	{
		for(int i = 0;i<v;i++)
		{
			for(int j = 0;j<h;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
