package ex01.method;

import java.util.Scanner;

public class MethodEx {
	public static String name(String n) {
		return n;
	}
	public static String name(String n, int x) {
		String str = "";
		for (int i = 0; i < x; i++) {
			str += n + "\n";
		}
		return str;
	}
	public static void main(String[] args) {
		String name = name("yunseong");
		System.out.println(name);
		System.out.println(name("yunseong"));
		System.out.println(name("yunseong", 5));
		//계산기
		Scanner sc = new Scanner(System.in);
		int first, second, result=0; char op; 
		
		System.out.println("계산하려는 두 수를 입력해주세요");
		first = sc.nextInt(); second = sc.nextInt();
		
		System.out.println(add(first,second));
		System.out.println(sub(first,second));
		System.out.println(mul(first,second));
		System.out.println(add(first,second));
		
		
	}
	
	public static int add(int first, int second) {
		return first+second;
	}
	public static int sub(int first, int second) {
		return first-second;
	}
	public static int mul(int first, int second) {
		return first*second;
	}
	public static double div(int first, int second) {
		int result = 0;
		try {
			result = first/second;			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
