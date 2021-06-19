package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int remainder;
		int original=407;
		int compare = original;
		int sum = 0;
		while (original >0) {
			remainder = original % 10;
			sum = sum + (remainder*remainder*remainder);
			original = original / 10;
		}
		if (sum == compare) {
		System.out.println(sum+" "+"is a Armstrong number");
		}
		

	}

}
