package quiz;

import java.util.Scanner;

//*/
public class Quiz_Score3 {
	//문제 3 성적표 프로그램 작성(배열 이용)
	//이름, 국어, 영어, 전산 점수 입력 받아서 총점/평균/학점 구하는 프로그램작성
	

	public static void main(String[] args) {
		
		Object[][] table = new Object[8][7];
		setting(table);

		//학생수
		int cnt = 0;
		//과목, 성적
		int kor=0, eng=0, com=0, tot;
		char grade;
		double avg;
		String name;
		//표 만들어 주기
		
		//성적입력받기
		Main : while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("name = ");
			name = sc.next();
			//성적입력
			int[] input = Input(kor, eng, com);
			kor = input[0]; eng=input[1]; com=input[2];
			
			//성적계산
			tot = Sum(kor, eng, com);
			avg = Avg(tot);
			grade = Grade(avg);
			Input(table, name, cnt, kor, com, eng, tot, avg, grade);
			
			//한명 입력 후 출력
			Print(table, cnt);
			
			//7명 다 입력하면 스탑
			if(cnt==7) break;
			cnt++;
		}
		//총인원 출력
		PrintTotal(table);
		
	}
	
	//테이블 세팅 
	public static void setting(Object[][] table) {
		table[0][0] = "이름";table[0][1] = "국어";table[0][2] = "영어";
		table[0][3] = "전산";table[0][4] = "총점";table[0][5] = "평균";
		table[0][6] = "학점";		
	}
	//성적 입력
	public static int[] Input(int kor, int eng, int com) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("kor = ");
			kor = sc.nextInt();
			if(!(kor<=100 && kor>=0))System.out.println("점수를 0 ~ 100 사이로 입력해주세요");
			else {
				break;
			}
		}
		while(true) {
			System.out.println("eng = ");
			eng= sc.nextInt();
			if(!(eng<=100 && eng>=0))System.out.println("점수를 0 ~ 100 사이로 입력해주세요");
			else {
				break;
			}
		}
		while(true) {
			System.out.println("com = ");
			com = sc.nextInt();
			if(!(com<=100 && com>=0))System.out.println("점수를 0 ~ 100 사이로 입력해주세요");
			else {
				break;
			}
		}
		return new int[] {kor, eng, com};
	}
	
	//총점, 평균, 학점
	public static int Sum(int kor, int eng, int com) {
		return kor+eng+com;
	}
	public static double Avg(int sum) {
		return sum/3.0;
	}
	public static char Grade(double avg) {
		char grade;
		switch((int)avg/10) {
			case 10:
			case 9: grade='A';break;
			case 8 : grade='B';break;
			case 7 : grade='C';break;
			case 6 : grade='D';break;
			default: grade='F';
		}
		return grade;
	}

	//성적표 테이블에 입력
	public static void Input(Object[][] table, String name, int cnt, int kor, int com, int eng, int tot, double avg, char grade) {
		table[cnt][0] = name;
		table[cnt][1] = kor;
		table[cnt][2] = eng;
		table[cnt][3] = com;
		table[cnt][4] = tot;
		table[cnt][5] = avg;
		table[cnt][6] = grade;
	}
	//한명 출력 메서드
	public static void Print( Object[][] table, int cnt) {
		System.out.println("*****"+cnt+1+"번 학생 정보입니다*****");
		for(int j =0; j <table[cnt].length ;j++) {
			System.out.print(table[cnt][j] + "\t");
		}
		System.out.println();
	}
	
	//성적표 출력 메서드
	public static void PrintTotal(Object[][] table) {
		System.out.println("*****총 학생 성적표*****");
		for(int i =0; i< table.length ; i++) {
			for(int j =0; j <table[i].length ;j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
//*/	
}
