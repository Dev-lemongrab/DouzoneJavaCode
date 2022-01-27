package ex02.exception;

import java.util.Scanner;

public class MainExcption {
	public static void main(String[] args) {
		System.out.println("integer data input");

		Scanner sc = new Scanner(System.in);
		int x, y, result=0;
		x= sc.nextInt(); y= sc.nextInt();

		
		try {
			result = x/y;
			System.out.println(result);
		
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
		
		} finally {//
			System.out.println("finally 무조건 출력된다.");
			
		}

		
		
		
		
		
	
	
	}
}
