/*
package ex02.operator;

public class MainEntry {
//최단산쉬관논삼대콤
	public static void main(String[] args) {
		//shift연산자 : <<, >>
		int x = 8, result;
//		result = x<<2; //left shift : 원래 값 * 2 ^ bit수
//		System.out.println("left shift result : " + result);

		result = x >>3; //right shift : 원래 값 / 2 ^ bit수 
		System.out.println("right shift result : " + result);
	}
}
//*/
//*
package ex02.operator;

public class MainEntry {
	public static void main(String[] args) {
		//관계연산자 >,<,>=,<=,==(같다), !=(같지않다)
		int x = 20, y = 20;
		if(x!=y)
			System.out.println("같지않습니다.");
		else 
			System.out.println("같습니다.");
		
		//삼항연산자 :(조건)? 참 : 거짓;
		String msg = null; //msg = "";
		msg =(x!=y)? "같지 않습니다.": "같습니다.";
		System.out.println(msg);
		int a = 10, b = 20, c = 30;
		int result;
		result =(a>b)? b+c: a+c;
		System.out.println(result);
		
	}
}
//*/
/*
package ex02.operator;

public class MainEntry {
	public static void main(String[] args) {
		
	}
}
//*/
/*
package ex02.operator;

public class MainEntry {
	public static void main(String[] args) {
		
	}
}
//*/
