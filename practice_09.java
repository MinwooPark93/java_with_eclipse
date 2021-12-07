package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class practice_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] st = new int[5];
		int sum = 0;
		int count = 0;
		for(int i = 0;i<5;i++)
		{
			st[i] = scan.nextInt();
			sum += st[i];
		}
		double avg = (sum / 5.0);
		System.out.println(avg);
		
		int sum2 = 0;
		for(int i = 0;i<5;i++)
		{
			sum2 += (st[i] - avg) * (st[i] - avg);
		}
		double bunsan = sum2 / 5.0; 
		System.out.println(bunsan);
		
		
		scan.close();
		
		
	}

}
