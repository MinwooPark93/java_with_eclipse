package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�迭 ũ�� : ");
		int size = scan.nextInt();
		int [] a = new int[size];
		
		for(int i = 0;i<size;i++)
		{
			a[i] = scan.nextInt();
		}
		System.out.print("����� : ");
		avg(a, size);
		System.out.println("��� �����̽��ϴ�!");


	}
	public static void avg(int a[], double b)
	{
		int sum = 0;
		for(int i = 0;i<b;i++)
		{
			sum += a[i];
		}
		double avg = (sum / b);
		System.out.println(avg);

	}

}
