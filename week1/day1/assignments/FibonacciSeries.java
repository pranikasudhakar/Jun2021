
package week1.day1.assignments;

public class FibonacciSeries {

	
	public static void main(String[] args) {

		int firstNum=0;
		int secondNum=1;
		int output;
		int count=8;
		
		for(int i=2;i<count;++i)
		{
			output=firstNum+secondNum;
			System.out.println(" "+output);
			firstNum=secondNum;
			secondNum=output;
		}		
	}

}
