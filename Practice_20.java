package my_first_javaproject_with_minsoo;

public class Practice_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int [][] B = new int [4][3];
		for(int i = 0;i<B.length;i++)
		{
			for(int j = 0;j<B[0].length;j++)
			{
				B[i][j] = A[j][i];
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}

	}

}
