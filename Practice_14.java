package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] num = new int[5];
		int max_val = Integer.MIN_VALUE;
		int max_id = 0;
		
		for(int i = 0;i<num.length;i++)
		{
			num[i] = scan.nextInt();
			if(num[i] > max_val)
			{
				max_val = num[i];
				max_id = i + 1;
			}
		}
	
		System.out.println("최대값 위치 : " + max_id);
		
		
		
		scan.close();

	}

}
