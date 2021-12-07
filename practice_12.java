package my_first_javaproject_with_minsoo;

public class practice_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] var = new int[100];
		for(int i = 0;i<100;i++)
		{
			var[i] = i;
		}
		System.out.println(var[50]);
		
		
		var = new int[50];
		for(int i = 0;i<50;i++)
		{
			var[i] = i*2;
		}
		System.out.println(var[45]);

	}

}
