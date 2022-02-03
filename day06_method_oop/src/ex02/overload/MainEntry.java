package ex02.overload;

public class MainEntry {

	public static void line() {
		System.out.println("---------------");
		
	}
	public static void line(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("===============");
		}
		
	}
	public static void main(String[] args) {
		
		line(-30);//문제소지 있음
		
		line(3,5);
		line();
		line(5,3);//문제 소지 있음. 해결할 것!
		line();
		line("*", 10);
		line();
		line(3);
	}
	private static void line(String str, int n) {
		
		for (int i = 1; i < n; i++) {
			System.out.print(str+" ");
		}
		System.out.println();
	}
	public static void line(int x, int n) {
		int temp;
//		if(x>n) {
//			int t = x;
//			x = n;
//			n = t;
//		}
		temp = (x > n)? x : n;
		for(int i = n ; i <= temp ; i++) {
			System.out.print("&");
		}
		System.out.println();
	}
}
