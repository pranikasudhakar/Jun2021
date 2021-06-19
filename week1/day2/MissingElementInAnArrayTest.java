package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArrayTest {

	public static void main(String[] args) {
		int[] num= {1,2,4,3,5,7,8};
		Arrays.sort(num);
		Arrays.toString(num);

		for (int i=num[0]; i<num.length; i++)  {
			if( i != num[i-1]) {
			System.out.println("Missing number is"+" "+i);
			break;
		}
		}
	}
}
