package ex05.debug;

public class MainEntry {
	public static void main(String[] args) {
		int x = 5, y = 0;
		int i;
		for(i = 1; i<6 ; i++) {
			y += x * i;
		}
		for(i = 1; i< 100 ; i++) {
			if(i ==30) {
				System.out.println(i);
			}
		}//end for
		System.out.println(x+ ", " + y + ", " + i);
	}
}
