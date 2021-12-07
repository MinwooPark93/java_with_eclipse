package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] num = new int[10];
		int count = 0;
		for(int i = 0;i<10;i++)
		{
			num[i] = scan.nextInt();
		}
		System.out.println("query?");
		int query = scan.nextInt();
		for(int i = 0;i<10;i++)
		{
			if(num[i] == query)
			{
				count++;
			}
		}
		System.out.println(count);
	
	}

}
