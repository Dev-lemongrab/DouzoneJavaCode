package ex02.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("integer data input");
//		int su = new Scanner(System.in).nextInt();
//		
//		//짝 홀수 판정 if
//		if(su %2 ==0) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");
//		}//if end
		Scanner sc = new Scanner(System.in);
		int x, y, result=0;
		try {
			x= sc.nextInt(); y= sc.nextInt();
			result = x/y;
			System.out.println(result);
		} catch (Exception e) {
			//System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
		}
		
//		if(y!=0) result = x/y; //0으로 나누면 ArithmaticException이나옴			
//		else {
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.exit(0);//강제종료
//		}
		
		
		
		
		
	
	
	}
}
