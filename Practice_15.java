package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int [] num = new int[size];
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<size;i++)
		{
			num[i] = scan.nextInt();
				if(min > num[i])
				{
					min = num[i];
				}
				
		}
		System.out.println(min);
	
	}

}
