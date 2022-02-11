package ex02.io;

public class MainEntry {
	public static void main(String[] args){
		System.out.print("input = ");
		try {
			int su;
			while((su = System.in.read())!= -1) {
				if(su== 10 || su ==13||su==32) continue;
				if(su ==113 || su == 81) break;//'q', ||'Q'
				
				char ch = (char)su;
				System.out.print(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*/
package ex02.io;

public class MainEntry {
	public static void main(String[] args) throws Exception{
		int su = 1, su2 = 2;
		System.out.println("데이터 입력끝은 ctrl + z를 누르세요");
		while((su=System.in.read()) != -1) {
			System.out.print((char)su+ "\t");
		}
		su2 = System.in.read();
		System.out.println(su2 + 1000);
	}
}

//*/
/*/
package ex02.io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in;
		System.out.print("단일문자 입력 요망 : ");
		try {
			int num = is.read()-48;//ASC code
			
			is.read(); is.read();//문제발생처리 - 자바에 문자 2바이트 처리됨
			
			int num2 = is.read()-48;
			
			System.out.println(num+num2);
		} catch (IOException e) {
//			System.out.println("user error message");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
//*/
