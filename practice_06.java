package my_first_javaproject_with_minsoo;

public class practice_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=6;i++)
		{
			for(int j = 1;j<=6;j++)
			{
				if((i + j) % 4 == 0)
				{
					System.out.println(i + ", " + j);
				}
			}
		}

	}

}