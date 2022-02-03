package ex01.method;

import java.util.Arrays;
import java.util.Scanner;

public class MainEntry {
	
	//1) 매개변수 없고, 리턴타입 없는 경우
	public static void namePrint() {
		for(int i = 0; i <11 ; i++) {
			System.out.println("oh yun seong");
		}		
	}
	public static int plus() {
		int result = 300;
		return 2+3*5-7;
	}
	
	public static void main(String[] args) {
		namePrint();
		add(1,2);
		add(10,30);
		
		int result = plus();
		System.out.println(result);
		
		
//		int[] a = {1,2,3,4,5,6,7};
//		Scanner sc;
//		sc = new Scanner(System.in);
//		
//		int kor = sc.nextInt();
//		System.out.println();
//		
//		Arrays.sort(a);
	}
	
	//
	public static void add(int x, int y) {
		int hap = x + y;
		System.out.println("hap = " + hap);
	}
}
