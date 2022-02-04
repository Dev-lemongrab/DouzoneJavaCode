package quiz;

import java.util.Scanner;

//*/
//스코어 클래스
class Score{
	
	protected int kor;
	protected int eng;
	protected int com;
	protected String name;
	
	public Score() {
		// TODO Auto-generated constructor stub
	}
	public Score(int kor, int eng, int com, String name) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class ScoreSummary extends Score{

	private double avg;
	private double tot;
	private char grade;
	
	public ScoreSummary() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		super.name = sc.nextLine();
		while(true) {
			try {
				System.out.print("kor = ");
				super.kor = sc.nextInt();
				if(!(kor<=100 && kor>=0))System.out.println("점수를 0 ~ 100 사이로 입력해주세요");
				else break;
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요");
				sc = new Scanner(System.in);
			}
		}
		while(true) {
			try {
				System.out.print("eng = ");
				super.eng= sc.nextInt();
				if(!(eng<=100 && eng>=0))System.out.println("점수를 0 ~ 100 사이로 입력해주세요");
				else break;				
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요");
				sc = new Scanner(System.in);
			}
		}
		while(true) {
			try {
				System.out.print("com = ");
				super.com = sc.nextInt();
				if(!(com<=100 && com>=0))System.out.println("점수를 0 ~ 100 사이로 입력해주세요");
				else break;				
			} catch (Exception e) {	
				System.out.println("숫자만 입력해주세요");
				sc = new Scanner(System.in);
			}
		}
		
		this.tot = super.kor+super.eng+super.com;
		this.avg = tot/3.0;
		
		switch((int)avg/10) {
		case 10:
		case 9: this.grade='A';break;
		case 8 : this.grade='B';break;
		case 7 : this.grade='C';break;
		case 6 : this.grade='D';break;
		default: this.grade='F';
		}
	}
	
	
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getTot() {
		return tot;
	}
	public void setTot(double tot) {
		this.tot = tot;
	}

	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "ScoreSummary [avg=" + avg + ", tot=" + tot + ", grade=" + grade + ", kor=" + kor + ", eng=" + eng
				+ ", com=" + com + ", name=" + name + "]";
	}


	public void Print() {
		System.out.println(this.toString());
	}
	
	
} 

public class Quiz_Score {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//성적입력받기
		Main : while(true) {
			//생성과 동시 성적입력 + 성적계산 
			System.out.print("성적 입력 시간입니다.\n이름과 성적을 입력해주세요!\n");
			ScoreSummary sm = new ScoreSummary();
			//한명 입력 후 출력
			System.out.println();
			sm.Print();
			System.out.println();
			
			//계속할지 말지결정
			while(true) {
				System.out.println("다음학생 입력을 원하시면 1을 눌러주세요.");
				System.out.println("종료를 원하시면 아무 숫자나 눌러주세요.");
				System.out.print("입력 : ");
				try {
					int flag = sc.nextInt();
					if(flag != 1) break Main;
					else break;
				} catch (Exception e) {
					sc = new Scanner(System.in);
					System.out.println("숫자로 다시 입력해주세요!\n");
				}
			}
		}
	}
}
