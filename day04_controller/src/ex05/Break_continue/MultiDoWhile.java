package ex05.Break_continue;

public class MultiDoWhile {
	public static void main(String[] args) {
		int a = 1, b = 1;
		do {
			b=1;//do while문은 조건 전에 실행돼서 바깥루프에서 한번 초기화를 해줘야 한다.
			do {
				System.out.print(b+"\t");
				b++;
			}while(b<=3);
			a++;
			System.out.println();
		}while(a<=2);
	}
}	
