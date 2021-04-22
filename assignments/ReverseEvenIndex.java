package week1.assignments;

public class ReverseEvenIndex {

	public static void main(String[] args) {
		
		String word = "I am a software tester";
		String text[] = word.split(" ");
		for (int i = 0; i < text.length; i++) {
			if (i%2==0) {
				System.out.print(text[i]+ " ");
			}else {
				char[] charArray = text[i].toCharArray();
				for (int j = charArray.length-1; j >=0; j--) {
					System.out.print(charArray[j]);
				}
				   System.out.print(" ");
			}
		}
	}

}

