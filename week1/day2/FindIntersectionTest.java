package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class FindIntersectionTest {

	public static void main(String[] args) {
	
		int[] a1 = {3,2,11,4,6,7};
		//Arrays.sort(a1);
		//System.out.println(Arrays.toString(a1));
		
		int[] a2 = {1,2,8,4,9,7};
		//Arrays.sort(a2);
		//System.out.println(Arrays.toString(a2));
		
		//int i=0;
		for (int i=0; i<a1.length; i++){
			for (int j=0; j<a2.length; j++){
				if (a1[i]==a2[j]) {
					System.out.println(a1[i]);
					break;
				}
			}
		}

	}

}