package my_first_javaproject_with_minsoo;

public class Practice_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String word = "Hello Java World";
		int index = word.indexOf("Java");
		System.out.println(index);
		
		String word1 = "박민수";
		String word2 = "샤러";
		boolean love = word1.equals(word2);
		System.out.println(love);
		
		String word1 = "트럼프는 미국대통령이다";
		String word2 = "바이든";
		System.out.println(word1.replace("트럼프", "바이든"));
		
		String word1 = "Hello Java";
		String word2 = word1.substring(0, 5);
		System.out.println(word2);*/
		String names = "이근섭,삼근섭,사근섭,오근섭";
		String [] name = names.split(",");
		for(int i = 0;i<name.length;i++)
			System.out.println(name[i]);
		
		

	}

}
