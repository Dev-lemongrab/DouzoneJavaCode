/*/
package ex03.operator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//논리연산자 : &, &&(and), |,||(or), ^(xor), !(not)2진논리 ==>결과값, 10진논리 ==> 결과 참,거짓
		int x = 4, y = 7;
		System.out.println(x&y);//4
		System.out.println(x|y);
		System.out.println(x^y);
		
		int a = 10, b = 20, c = 30;
		boolean result = true;
		
		result = (a > b)&& (b > c);//&&연산은 앞에 것이 거짓이면 뒤는수행 x
		System.out.println(result);

		result = (a < b)&& (b < c);//&&연산은 앞에 것이 거짓이면 뒤는수행 x
		System.out.println(result);
		
		result = (a > b) || (b > c);//||연산은 앞에 것이 참이면 뒤는 수행 x
		System.out.println(result);
		
		System.out.println(!result);
	}
}
//*/
//*/
package ex03.operator;

public class MainEntry {
	public static void main(String[] args) {
		//대입연산자 : =, +=, -=, >>=, <<=, /=, %=, *=, ...
		int x = 3, y = 5, result;
		result = x+y;
		
		x = x+y;
		x +=y;
		
		x = x*y;
		x *= y;
	}
}



