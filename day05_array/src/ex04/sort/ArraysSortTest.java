package ex04.sort;

import java.util.Arrays;

public class ArraysSortTest {
	public static void main(String[] args) {
		int[] a= {7,3,5,2,8};
		System.out.println("******* sort 전 출력 *******");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +"\t");
		}
		System.out.println();
		System.out.println("******* sort 후 출력 *******");
		//sort
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +"\t");
		}
		
		System.out.println("\n********내림차순*********");
		
		for(int i = a.length-1;i>=0;i--) {
			System.out.print(a[i]+"\t");
		}
		
	}
}
