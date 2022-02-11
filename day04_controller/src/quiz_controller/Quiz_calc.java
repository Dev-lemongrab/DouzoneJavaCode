package quiz_controller;

import java.util.Scanner;

public class Quiz_calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first, second, result=0; char op; 
//		switch case 사용
		
//		System.out.println("계산하려는 두 수를 입력해주세요");
//		first = sc.nextInt(); second = sc.nextInt();
//		System.out.println("연산자를 입력해주세요(+,-,*,/)");
//		op = sc.next().charAt(0);
//		switch (op) {
//			case '+': result = first+second; break;
//			case '-': result = first-second; break;
//			case '*': result = first*second; break;
//			case '/': try {result = first/second; break;} 
//					catch (ArithmeticException e) {System.out.println(e.getMessage());}
//			default: System.out.println("사칙연산자가 아닙니다.");break;
//		}
//		if(op=='+'||op=='-'||op=='/'||op=='*')
//			System.out.println(first+" "+op+" " + second +" = "+ result+" 입니다.");
		
		
//		if 문 사용
		System.out.println("계산하려는 두 수를 입력해주세요");
		first = sc.nextInt(); second = sc.nextInt();
		System.out.println("연산자를 입력해주세요(+,-,*,/)");
		op = sc.next().charAt(0);
		
		if(op=='+')result = first+second; 
		else if(op=='-')result = first-second; 
		else if(op=='*')result = first*second; 
		else if(op=='/'){
			try {result = first/second; } 
			catch (ArithmeticException e) {System.out.println(e.getMessage());}
		}
		else System.out.println("사칙연산자가 아닙니다.");
		
		if(op=='+'||op=='-'||op=='/'||op=='*')
			System.out.println(first+" "+op+" " + second +" = "+ result+" 입니다.");
	}

}
