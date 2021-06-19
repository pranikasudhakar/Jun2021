package week1.day2;

public class CharOccuranceAssign6 {

	public static void main(String[] args) {
		String input = "welcome to chennai";
		int count=0;
		char compare = 'e';
		
		char[] character = input.toCharArray();
		for (int i=1; i < character.length; i++) {
			if (character[i] == compare) {
				count++;
			}
		}
		System.out.println("Character "+ compare + " occurence is " + count);
	}

}
