package quiz;

import java.util.Scanner;

//*/
public class Quiz_Score3 {
	//점수는 0~100점 사이만 입력받기
	//y/n? 원하는 만큼 입력받기 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		Main : while(true) {
			
			int kor, eng, com;
			String name ;
			
			System.out.println("name = ");
			name = sc.next();
			
			while(true) {
				System.out.println("kor = ");
				kor = sc.nextInt();
				if(!(kor<=100 && kor>=0))System.out.println("점수를 0 ~ 100 사이로 입력해주세요");
				else break;
			}
			while(true) {
				System.out.println("eng = ");
				eng= sc.nextInt();
				if(!(eng<=100 && eng>=0))System.out.println("점수를 0 ~ 100 사이로 입력해주세요");
				else break;
			}
			while(true) {
				System.out.println("com = ");
				com = sc.nextInt();
				if(!(com<=100 && com>=0))System.out.println("점수를 0 ~ 100 사이로 입력해주세요");
				else break;
			}
				eng = sc.nextInt();
				com = sc.nextInt();
			int tot = kor + eng + com;
			double avg = tot/3.0; //avg = (double)tot/3;
			char grade;
			
			switch((int)avg/10) {
			case 10:
			case 9: grade='A';break;
			case 8 : grade='B';break;
			case 7 : grade='C';break;
			case 6 : grade='D';break;
			default: grade='F';
			}
			
			System.out.println("\n\n****** " + name + "님의 성적표 ******");
			System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com );
			System.out.printf("총점 : %d 평균 : %.2f 학점: %c \n", tot, avg, grade);
			
			System.out.println();
			
			while(true) {
				System.out.println("계속 하시겠습니까?(y/n)");
				String flag = sc.next();
				if(flag.equalsIgnoreCase("n")) break Main;
				else if(flag.equalsIgnoreCase("y")) break;
				else System.out.println("잘못입력하셨습니다.");
			}
			
		}
	
		//윤년 평년 판정 프로그램 작성
		//전산, 영어, 국어 점수 입력 받아서 평균 60점이상이고 각과목 과락 40점 이하면 
		//과목 불합격 처리하는 프로그램 작성
				
		
		
		
	}
	
//*/	
}
