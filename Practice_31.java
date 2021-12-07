package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("¿øÁö¸§? : ");
		double r = scan.nextInt();
		double size = measure(r);
		
		
		System.out.println(size);

	}
	public static double measure(double a)
	{
		double b = ((double)a / 2.0) * (a / 2) * 3.141592;
		return b;
	}

}
