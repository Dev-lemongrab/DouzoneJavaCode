package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreProgram {

	Scanner sc = new Scanner(System.in);
	ArrayList<ScoreManager> list = new ArrayList<ScoreManager>();

	public void operation() {

		while (true) {
			try {

				System.out.print("성적 입력 시간입니다.\n이름과 성적을 입력해주세요!\n");
				System.out.println("원하시는 서비스를 입력해주세요!\n1 : 학생등록\n2 : 학생삭제 \n3 : 학생수정 \n4 : 학생리스트조회 \n아무 키 입력 : 프로그램종료");
				System.out.println("=======================================");
				int option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.println("학생정보를 등록하겠습니다.");
					input();
					break;
				case 2:
					System.out.println("학생정보를 삭제하겠습니다.\n");
					del();
					break;
				case 3:
					System.out.println("학생정보를 수정하겠습니다.");
					modify();
					break;
				case 4:
					System.out.println("고객리스트 조회");
					print();
					break;
				default:
					System.out.println("종료합니다.");
					System.exit(0);
					break;
				}

			} catch (Exception e) {
				// 아무키를 입력하면 예외발생
				sc = new Scanner(System.in);
				System.out.println("종료합니다.");
				System.exit(0);

			}
		}
	}

	public void input() {

		System.out.println("학생 정보를 입력합니다");
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("국어 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 입력 : ");
		int eng = sc.nextInt();
		System.out.println("전산 입력 : ");
		int com = sc.nextInt();

		ScoreManager sm = new ScoreManager(name, kor, eng, com);
		list.add(sm);
	}

	public void del() {
		while (true) {
			try {
				System.out.println("삭제할 학생의 인덱스 입력 : ");
				list.remove(sc.nextInt()-1);
				System.out.println("삭제완료");
				break;
			} catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("숫자만 입력해주세요!");
			}
		}
	}
	
	public void modify() {
		while(true) {
			try {
				System.out.println("수정할 학생의 인덱스 입력");
				int n = sc.nextInt()-1;
				
				System.out.println("이름 입력 : ");
				String name = sc.next();
				System.out.println("국어 입력 : ");
				int kor = sc.nextInt();
				System.out.println("영어 입력 : ");
				int eng = sc.nextInt();
				System.out.println("전산 입력 : ");
				int com = sc.nextInt();
				ScoreManager sm = new ScoreManager(name, kor, eng, com);
				list.add(n, sm);
				break;
			} catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("숫자만 입력해주세요!");
			}
		}
	}
	public void print() {
		System.out.println();
		System.out.println();
		System.out.println("=====학생정보를 출력합니다=====");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("-------------------------");
		}
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		ScoreProgram pro = new ScoreProgram();
		pro.operation();
	}
}