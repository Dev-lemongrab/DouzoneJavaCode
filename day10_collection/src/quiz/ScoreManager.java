

package quiz;

import java.util.Scanner;

//*/
//스코어 클래스

public class ScoreManager extends Score {

	protected double avg;
	protected int sum;
	protected char grade;
	//생성자를 통해 학생 등록 및 성적 처리 실행
	public ScoreManager(String name, int kor, int eng, int com) {
		super.name = name;
		super.kor = kor;
		super.eng = eng;
		super.com = com;
		this.sum = kor + eng + com;
		this.avg = sum / 3.0;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			this.grade = 'A';
			break;
		case 8:
			this.grade = 'B';
			break;
		case 7:
			this.grade = 'C';
			break;
		case 6:
			this.grade = 'D';
			break;
		default:
			this.grade = 'F';
		}
	}
	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "학생정보 : [avg=" + avg + ", sum=" + sum + ", grade=" + grade + ", kor=" + kor + ", eng=" + eng
				+ ", com=" + com + ", name=" + name + "]";
	}
	
	

}

