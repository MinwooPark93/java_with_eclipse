package my_first_javaproject_with_minsoo;

public class practice_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = -10; x<=10;x++)
		{
			for(int y = 0;y<=10;y++)
			{
				if(y == x * x)
					{
						System.out.println(x + ", " + y);
					}
			}
		}

	}

}
