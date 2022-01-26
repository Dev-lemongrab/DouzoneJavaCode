package quiz;

import java.util.Scanner;
/*/
public class Quiz_Score {
	//성적표 입력 받아서 국어 영어 전산 이름 입력 받아서 총점, 평균
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수입력 : ");
		int korean = sc.nextInt();
		System.out.println("영어점수입력 : ");
		int eng = sc.nextInt();
		System.out.println("전산점수입력 : ");
		int com = sc.nextInt();		
		System.out.println("이름입력 : ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + eng);
		System.out.println("전산 : " + com);
		System.out.println("총점 : " + korean+eng+com);
		System.out.println("평균 : " + (korean+eng+com)/3.0);
	}
	
//*/	
//*/
public class Quiz_Score {
	//성적표 입력 받아서 국어 영어 전산 이름 입력 받아서 총점, 평균
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("name = ");
		String name = sc.nextLine();
		System.out.println("kor, eng, com score = ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		int tot = kor + eng + com;
		double avg = tot/3.0; //avg = (double)tot/3;
		System.out.println("\n\n**** " + name + "님의 성적표 ******");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com );
		System.out.printf("총점 : %d 평균 %.2f \n", tot, avg);
	}
	
//*/	
}
