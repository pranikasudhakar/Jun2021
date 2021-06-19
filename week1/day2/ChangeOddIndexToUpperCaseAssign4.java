package week1.day2;

public class ChangeOddIndexToUpperCaseAssign4 {

	public static void main(String[] args) {
		String input = "changeme";
		char[] charArray = input.toCharArray();
		
		char even,odd;
		for(int i = 0; i < charArray.length ; i++) {
		
			if(i%2 == 0) {
				even = Character.toUpperCase(charArray[i]);
				System.out.println(even);
			}
			else {
				odd= Character.toLowerCase(charArray[i]);
				System.out.println(odd);
			}
		}
		

	}

}
