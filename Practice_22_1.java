package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_22_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = -1;
		int sum = 0;
		int count = 0;
		while(true)
		{
			num = scan.nextInt();
			if(num == 0)
				break;
			sum += num;
			count++;
		}
		try
		{
			System.out.println((double)sum / count);
		}
		catch(Exception e)
		{
			System.out.println(0);
		}

	}

}
