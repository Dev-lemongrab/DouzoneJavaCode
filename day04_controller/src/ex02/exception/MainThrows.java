package ex02.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainThrows {
	public static void main(String[] args) throws ArithmeticException, InputMismatchException{
		//예외처리 위임, 그냥 최상위인 Exception 넣어도 된다.
		Scanner sc = new Scanner(System.in);
		int x, y, result=0;

		System.out.println("integer data input");
		x= sc.nextInt(); y= sc.nextInt();
		
		result = x/y;
		System.out.println(x+"/"+y+"="+result);		
	
	}
}
