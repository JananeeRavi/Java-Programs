package week1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		String word = "Jananee";
		char[] charArray = word.toCharArray();
		String str = new String("");
		
		for (int i = charArray.length-1; i >=0; i--) {
			str+= charArray[i];
			} if (word.equalsIgnoreCase(str)) {
				System.out.println("This is a palindrome");
			}else {
				System.out.println("This is not a palindrome");
			}

	}

}