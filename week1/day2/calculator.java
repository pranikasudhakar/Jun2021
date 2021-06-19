package week1.day2;

public class calculator {


	public int add(int a, int b) {
	return a+b;
	}
	public int subtract(int a, int b) {
	return a-b;
	}
	
	public int multiply(int a, int b) {
	return a*b;
	}
	
	public int divide(int a, int b) {
	return a/b;
	}
	
	public static void main(String[] args) {
		calculator c=new calculator();
		int sum;
		sum = c.add(5,2);
		System.out.println(sum);
		sum = c.subtract(5, 2);
		System.out.println(sum);
		sum = c.multiply(5, 2);
		System.out.println(sum);
		sum = c.divide(5,2);
		System.out.println(sum);
	}

}
