package my_first_javaproject_with_minsoo;

public class Practice_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][]yiza =  {{3.2,3.1,3.2,3.0},{2.9,2.8,2.7,2.6},{2.7,2.6,2.5,2.7}};
		int sum = 0;
		for(int i = 0;i<yiza.length;i++)
		{
			for(int j = 0;j<yiza[0].length;j++)
			{
				sum += yiza[i][j];
			}
		}
		System.out.println((double)sum / (yiza.length * yiza[0].length));
		
		double yiza1 = 0;
		double yiza2 = 0;
		double yiza3 = 0;
		for(int i = 0;i<yiza.length;i++)
		{
			yiza1 += yiza[0][i];
		}
		System.out.println((double)yiza1 /  yiza[0].length);
		for(int i = 0;i<yiza.length;i++)
		{
			yiza2 += yiza[1][i];
		}
		System.out.println((double)yiza2 /  yiza[0].length);

		for(int i = 0;i<yiza.length;i++)
		{
			yiza3 += yiza[2][i];
		}
		System.out.println((double)yiza3 /  yiza[0].length);
		
	}

}
