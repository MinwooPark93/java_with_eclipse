package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sent = scan.nextLine();
		String [] word = sent.split(" ");
		int sum = 0;
		for(int i = 0;i<word.length;i++)
		{
			sum += word[i].length();
		}
		System.out.println((double)sum / word.length);
		
		

	}

}
