package my_first_javaproject_with_minsoo;

public class Practice_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b= 2;
		int [] swapped = swap(a, b);
		
		
			System.out.println(swapped[0] + ", " + swapped[1]);

		
	}
	public static void swap1(int []a)
	{
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
	public static int[] swap(int a, int b)
	{
		int [] c = {a, b};
		int temp = c[0];
		c[0] = c[1];
		c[1] = temp;
		return c;
	}

}
