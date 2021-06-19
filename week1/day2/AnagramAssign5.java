package week1.day2;

import java.util.Arrays;

public class AnagramAssign5 {

	public static void main(String[] args) {
		String input1 = "stops";
		String input2 = "potss";
		
		if (input1.length() == input2.length()) {
			char[] charArray1 = input1.toCharArray();
			char[] charArray2 = input2.toCharArray();
			
			boolean compare;
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			compare = Arrays.equals(charArray1, charArray2);
			
			if (compare)
			{
				System.out.println("Given input is Anagram");
			}
			else {
				System.out.println("Given input is not a Anagram");
			}
			
			
			
		}

	}

}
