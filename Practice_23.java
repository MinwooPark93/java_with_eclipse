package my_first_javaproject_with_minsoo;

public class Practice_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String word = "Hello Java World";
		int index = word.indexOf("Java");
		System.out.println(index);
		
		String word1 = "�ڹμ�";
		String word2 = "����";
		boolean love = word1.equals(word2);
		System.out.println(love);
		
		String word1 = "Ʈ������ �̱�������̴�";
		String word2 = "���̵�";
		System.out.println(word1.replace("Ʈ����", "���̵�"));
		
		String word1 = "Hello Java";
		String word2 = word1.substring(0, 5);
		System.out.println(word2);*/
		String names = "�̱ټ�,��ټ�,��ټ�,���ټ�";
		String [] name = names.split(",");
		for(int i = 0;i<name.length;i++)
			System.out.println(name[i]);
		
		

	}

}
