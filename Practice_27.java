package my_first_javaproject_with_minsoo;

import java.util.Scanner;

public class Practice_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String [][] addr = 
			{
				{"�̱ټ�","010-8072-3272"},
				{"�ټ���","010-789-2580"},
				{"���̱�","010-123-4567"},
				{"�̼���","010-248-1357"}
			};
		
		String name = scan.nextLine();
		for(int i = 0;i<addr.length;i++)
		{
				if(name.equals(addr[i][0]))
				{
					System.out.println(addr[i][1]);
				}
		}
		

	}

}
