package quiz_controller;

import java.util.Scanner;

//*/
public class Quiz_Score {
	//성적표 입력 받아서 국어 영어 전산 이름 입력 받아서 총점, 평균
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("name = ");
		String name = sc.next();
		
		System.out.println("kor, eng, com score = ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		
		int tot = kor + eng + com;
		double avg = tot/3.0; //avg = (double)tot/3;
		char grade;
		//학점(평점) : A~F 학점
//		if(avg>=90.0) grade = 'A';
//		else if(avg>=80.0) grade = 'B';
//		else if(avg>=70.0) grade = 'C';
//		else if(avg>=60.0) grade = 'D';
//		else grade ='F';
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
	
		//윤년 평년 판정 프로그램 작성
		//전산, 영어, 국어 점수 입력 받아서 평균 60점이상이고 각과목 과락 40점 이하면 
		//과목 불합격 처리하는 프로그램 작성
				
		
		
		
	}
	
//*/	
}
