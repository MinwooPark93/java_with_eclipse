package my_first_javaproject_with_minsoo;

public class Practice_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] A = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] B = {{-1,-2,-3},{0,0,0},{-7,-8,-9}};
		
		int [][] C = new int [3][3];
		
		for(int i = 0;i<A.length;i++)
		{
			for(int j = 0;j<A[0].length;j++)
			{
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		for(int i = 0;i<A.length;i++)
		{
			for(int j = 0;j<A[0].length;j++)
			{
				System.out.print(C[i][j] + " ");
			}
			System.out.println("");

	}

}}