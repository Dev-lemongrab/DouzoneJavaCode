package quiz;

import java.util.Scanner;

public class Updown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//게임 시작
		main : while(true) {
			System.out.println("게임을 시작합니다!");
			int n = (int)((Math.random() * 100) +1);
			//난수 확인
			System.out.println("정답은 : " + n);
			for (int i = 0; i < 5; i++) {		
				System.out.println(i+1+"번째 숫자 입력!");
				int check = sc.nextInt();
				if (check > n)
					System.out.println("입력한 수가 더 큽니다.");
				else if (check < n)
					System.out.println("입력한 수가 더 작습니다.");
				else if (check == n){
					System.out.println("정답");
					break main;
				}
			}
			System.out.println("실패 하셨습니다.");
			while(true) {
				try {
					System.out.println("재도전하시겠습니까?");
					System.out.println("재도전 : 1");
					System.out.println("종료 : 2");
					int i= sc.nextInt();
					if(i ==1) {
						break;
					}else if(i ==2) {
						break main;
					}else {
						System.out.println("제대로 입력해주세요!");
					}
				} catch (Exception e) {
					sc = new Scanner(System.in);
					System.out.println("제대로 입력해주세요!");
				} 
			}
		}
	}
}
