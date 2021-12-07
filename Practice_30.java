package my_first_javaproject_with_minsoo;

public class Practice_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = twice(a);
		
		double c = 3.0;
		double d = 0.5;
		double e = multiple(c,d);
		
		System.out.println(b);
		System.out.println(e);

	}
	public static int twice(int a)
	{
		int c = 2 * a;
		return c;
	}
	public static double multiple(double a, double b)
	{
		double c = a * b;
		return c;
	}
	

}
