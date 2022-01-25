package ex02.dataType;

public class MainEntry {
	
	static int Num;//정수형 : 0, 실수형 : 0.0, 문자열 : Null
	static String str;
	
	public static void main(String[] args) {
		boolean b = true;
		
		
		int x = 30;
		int y;//지역변수는 반드시 초기화 하고 사용한다.
		y = 33;
		
		int su = 99;
		
		System.out.println(x+", "+su);
		System.out.println(Num);
		System.out.println(str);
		System.out.println(b);//1bit
		System.out.println(x);//4byte
		System.out.println(y);
		System.out.println(1000);
		System.out.println(1000L);//long
		
		double dd =12.34;//8byte
		System.out.println(dd);
		System.out.println(345.6789);//double
		
		float ff = 12.34f;//f,F 
		System.out.println(ff);//float : 4byte
		
		System.out.println(5.5F);
		
		short sh = 32767;//-32768 ~ 32767
		int i = 32769;
		sh = (short)i;
		System.out.println(sh);
		
	}
}


