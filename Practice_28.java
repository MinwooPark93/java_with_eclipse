package my_first_javaproject_with_minsoo;

public class Practice_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("저는" + 19 + "살 입니다.");
		String str = "Hello" + 1 + 2;
		System.out.println(str);
		
		String str1 = 1 + 2 + "Hello";
		System.out.println(str1);*/
		
		int age = 19;
		String str = Integer.toString(age);
		System.out.println(1 + 2 + str + 1);
		
		str = "19";
		age = Integer.parseInt(str);
		System.out.println(age + 1);

	}

}
