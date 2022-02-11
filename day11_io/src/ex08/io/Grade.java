package ex08.io;

import java.io.*;

public class Grade implements Serializable {
	
	private String subject;  //과목
	private int score;  //점수
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Grade [subject=" + subject + ", score=" + score + "]";
	}
	
	
}
