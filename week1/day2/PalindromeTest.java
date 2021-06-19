package week1.day2;

import java.util.Iterator;

public class PalindromeTest {

	public static void main(String[] args) {
		String input= ("madam");
//		System.out.println(input.length());
		
		String reverse= "";
		char[] charArray = input.toCharArray();
		for (int i=charArray.length-1; i >= 0; i--) {
//			System.out.println(charArray[i]); 
			reverse = reverse + input.charAt(i);
		}
		

		if (input.equalsIgnoreCase(reverse)) {
			System.out.println("Given input " + input + " is a palindrome");
			}
		else {
			System.out.println("Given input " + input +" is not a palindrome");
		
		}
	}

}
