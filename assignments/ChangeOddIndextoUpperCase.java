package week1.assignments;

public class ChangeOddIndextoUpperCase {

	public static void main(String[] args) {
				
		String word = "Changeme";
		char[] chars = word.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if (i % 2 == 0) {
				System.out.print(chars[i]);
				
			}
			else {
				System.out.print(Character.toUpperCase(chars[i]));
			}
		} 
		}
		
	}

