package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String cro = scan.nextLine();
		String [] word = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i = 0;i<word.length;i++)
		{
			cro = cro.replace(word[i], "_");
		}
		
		System.out.println(cro);
		System.out.println(cro.length());

	}

}
