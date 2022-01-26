package ex04.Input;

public class MainInput {
	public static void main(String[] args) {
		
//		String str = args[0];
		//int su = Integer.parseInt(args[1]);
//		
//		System.out.println(str);
//		System.out.println(su +33);
		
		int su = 123456;
		int hour = su/3600;
		su%=3600;
		int min = su/60;
		su%=60;
		int sec = su;
		System.out.println(hour + " 시" + min +" 분" + sec +" ");
		
		
		
	}
}
