package ex05.While;

public class MainEntry {
	public static void main(String[] args) {
		for(int i = 1;i<11;i++) {
			System.out.println(i);
		}
		System.out.println("-----while-----");
		int i=11;
		while(i >=1) {
			System.out.println(i);
			i--;
		}
		i=1;
		
		do {
			System.out.println(i);
			i++;
		}while(i<11);
		
	}
}
