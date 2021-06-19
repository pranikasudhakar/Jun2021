package week1.day2;

public class FindTypesAssign7 {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] character = test.toCharArray();
		
		for(int i=1; i<character.length; i++) {
			
			if (Character.isLetter(character[i])) {
				System.out.println(character[i] + " is a letter");
			}
			
			else if (Character.isDigit(character[i])) {
				System.out.println(character[i] + " is a Digit");
			}
			
			else if (Character.isSpace(character[i])) {
				System.out.println(character[i] + " is a Space");
			}
			else {
				System.out.println(character[i] + " is a special character");
			}
		}

	}

}
