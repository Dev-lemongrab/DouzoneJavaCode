package quiz;

import java.util.Scanner;

public class Quiz_Score2 {
	/*국어, 영어, 전산 점수 입력 받아서 평균 60점 이상 합격
    40점 이하 과락
    과락 과목 발생시 해당과목 표시
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("kor, eng, com score = ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		
		int tot = kor + eng + com;
		double avg = tot/3.0;
		
		if(kor>40 && eng > 40 && com >40) {
			if(avg>=60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
			if(kor<=40) System.out.println("국어 과락");
			if(eng<=40) System.out.println("영어 과락");
			if(com<=40) System.out.println("전산 과락");
		}
		
		
		
		
	}
}
