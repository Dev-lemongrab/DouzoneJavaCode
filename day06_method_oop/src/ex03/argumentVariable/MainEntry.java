package ex03.argumentVariable;

public class MainEntry {

	public static void plus(int...x) {//가변길이 배열
		int sum = 0;
		for(int i = 0; i < x.length ; i++) {
			sum += x[i];
		}
		System.out.println("sum = " + sum);
	}
	public static void main(String[] args) {
		plus("kbs", "mbc", "KOSA");
		plus("A", "B");
		plus(3);
		plus(1,2,3,4,5,6,7,8);
		plus(100, 20);
	}
	private static void plus(String ...x) {
		String str = "";
		for (int i = 0; i < x.length; i++) {
			str += x[i];
		}
		System.out.println(str);
	}
//
//	private static void plus(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void plus(int i, int j, int k, int l, int m, int n, int o, int p) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void plus(int i, int j) {
//		
//		
//	}

}
