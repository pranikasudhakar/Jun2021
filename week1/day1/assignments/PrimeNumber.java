package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int input =13;
		
		int count=0;
		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				count++;
			} 
		}
			if (count == 2) {
				System.out.println(input+" - "+"This number is Prime");				
			}
			else {
				System.out.println(input+" "+"This number is not Prime");	
			}
		}
}