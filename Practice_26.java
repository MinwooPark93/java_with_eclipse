package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String rev = ""; 
		int i = 0;
		for(i = 0;i<word.length();i++)
		{
			rev += word.charAt(word.length() - 1 - i);
		}
		System.out.println(word);
		System.out.println(rev);
		boolean isbreak = false;
		for(i = 0;i<word.length();i++)
		{
			if(rev.charAt(i) != word.charAt(i))
				{
					System.out.println("Not Palindrome");
					isbreak = true;
					break;
				}
							
		}
		if(!isbreak)
		{
			System.out.println("Palindrome");
		}
		
		
		
		


	}

}
