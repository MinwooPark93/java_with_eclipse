package my_first_javaproject_with_minsoo;

public class practice_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 1;a<=10;a++)
		{
			for(int b = 1;b<=10;b++)
			{
				for(int c = 1;c<=10;c++)
				{
					if((a * a * a) + (b * b * b) == c * c * c)
					{
						System.out.println("페르마의 마지막 정리는 틀렸다");
					}
				}
			}
		}
		System.out.println("페르마가 옳았다");
		
	}

}
