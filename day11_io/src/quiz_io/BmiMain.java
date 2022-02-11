package day11_io.src.quiz_io;


import java.util.Scanner;

public class BmiMain {
	
	Scanner sc = new Scanner(System.in);
	bmiController bmicon = new bmiController();
	
	public void operation() {
		
		while(true) {
			try {
				System.out.println("원하시는 메뉴를 입력해주세요\n1. bmi입력\n2. 회원리스트 출력\n3. 종료");
				int op = sc.nextInt();
				switch (op) {
				case 1:
					
					bmicon.calcPerson();
					break;
				case 2:
					bmicon.ViewFIle();
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("1,2,3 중에 하나 입력");
					break;
				}
				
			} catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("숫자만 입력해주세요");
			}
			
		}
	}
	public static void main(String[] args) {
		BmiMain main = new BmiMain();
		main.operation();

	}
	
}
