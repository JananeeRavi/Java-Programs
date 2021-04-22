package week1.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String input = "We learn java basics as part of java sessions in java week1";
		String words[]=input.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					words[j]=" ";
				}
				
			}
			System.out.print(words[i]+" ");
		}
	
			
		}
}
