package quiz;

import java.util.Scanner;

public class Triangle extends Draw{
	private int bottomW;//밑변
	public Triangle() {
		// 생성자
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변길이 : ");
		this.bottomW = sc.nextInt();
		System.out.print("높이 : ");
		this.h = sc.nextInt();
		
	}
	public Triangle(int h, int bottomW) {
		super.h= h;
		this.bottomW = bottomW;
	}
	public Triangle(int bottomW) {
		super();
		this.bottomW = bottomW;
	}
	//getter, setter
	public int getBottomW() {
		return bottomW;
	}
	public void setBottomW(int bottomW) {
		this.bottomW = bottomW;
	}
	@Override
	public String toString() {
		return "Triangle [bottomW=" + bottomW + ", h=" + h + ", result=" + result + "]";
	}
	
	
	@Override
	public double Width() {
		return super.result = (bottomW*super.h)/2.0;
	}
	
	
	
}
