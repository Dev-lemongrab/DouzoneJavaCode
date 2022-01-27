package ex02.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y, result=0;

		System.out.println("integer data input");
		x= sc.nextInt(); y= sc.nextInt();

		
		try {
			result = x/y;
			System.out.println(x+"/"+y+"="+result);
			
			
		}catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("ArithmeticException");//하위예외
		}catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}catch (RuntimeException e) {
			System.out.println("RuntimeException");
		}catch (Exception e) {
			System.out.println("Exception");//상위예
		}finally {
			System.out.println("finally 무조건 출력된다.");
		}//try end

		
		
		
		
		
	
	
	}
}
