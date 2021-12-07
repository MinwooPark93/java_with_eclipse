package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class practice_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] st = new int[5];
		int sum = 0;
		for(int i = 0;i<5;i++)
		{
			st[i] = scan.nextInt();
			sum += st[i];
		}
		double avg = (sum / 5.0);
		System.out.println(avg);
		
		for(int i = 0;i<5;i++)
		{
			if(st[i] > avg)
				System.out.println(st[i]);
		}

	}

}
