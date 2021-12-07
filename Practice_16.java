package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int [] num = new int[size];
		for(int i = 0;i<size;i++)
		{
			num[i] = scan.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<size;i++)
		{
			if(max <num[i])
			{
				max = num[i];
			}
		}
		double sum = 0;
		for(int i = 0;i<num.length;i++)
		{
			sum += (double)num[i] / (double)max * 100.0;
		}
		double avg = sum / num.length;
		System.out.println(avg);

		
	}

}
