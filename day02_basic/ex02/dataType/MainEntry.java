/*
package ex03.dataType;

public class MainEntry {
	
	public static void main(String[] args) {
		String str = "A";//문자열, " ", 2byte, A\0
		char ch = 'A';//문자, ' ', 1byte
		char ch2 = 67;
		char ch3 = 'b';//ASC = 98
		int su = 20; String name = "happy"; double dd = 12.34, ff = 3.45;
		System.out.println(ch); //A
		System.out.println(ch); //A
		System.out.println((int)ch);//ASC = 65
		System.out.println(ch2+ch3);
		System.out.println("name = " + name );
		System.out.println("실수형데이터 = " + dd);
		System.out.printf("%f %f \n", dd, ff);
		System.out.println("----------------------------------");
		
		for(int i =65 ; i<=90 ; i++) {
			System.out.print(i+ " ");
		}//end for
		
		System.out.println("\n\n==============================");
		for(int i='a'; i<='z' ;i++) {
			System.out.print((char)i+" ");
		}//end for
		
		System.out.println("\n\n boolean type");
		boolean flag = true;
//		int b = flag;
		System.out.println(flag);
	}
}
//*/

// ->맨위에 슬래쉬를 지우고 추가하면서 원하는 부분 주석을 달고 지우고 할 수 있다.


/*
package ex03.dataType;

public class MainEntry {
	
	public static void main(String[] args) {
		short sh = 32767;//-32,768 ~ 32,767 
		int num = 32769; //-21억 ~ 21억
		
		System.out.println(sh + " : "+ num);
		num = -32769;
		//num = sh; 묵시적형변환
		sh = (short)num;//명시적형변환 - 데이터 손실 발생
		System.out.println(sh + " : "+ num);
		
	}
}
//*/

//*
package day02_basic.ex02.dataType;

public class MainEntry {
	
	public static void main(String[] args) {
		int su = 10;
		
		System.out.printf("10진수 : %d\n", su);
		System.out.printf("8진수 : %o\n", su);
		System.out.printf("16진수 : %x %X \n", su, su);
		
		System.out.printf("\n\n%d %x %o %X \n", 10, 10, 10, 10);
		//0숫자 --> 8진수, 0x숫자 --> 16진수
		System.out.printf("%d \n", 012);
		System.out.printf("%d \n", 0xA);
		
		double f = 12.34;
		System.out.println(f);
		float ff =12.34f;//f를 붙여줘야 flaota형태인걸 안다. 아니면 double로 인식
	}
}
//*/





