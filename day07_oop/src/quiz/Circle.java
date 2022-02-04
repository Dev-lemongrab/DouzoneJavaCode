package quiz;

import java.util.Scanner;

public class Circle extends Draw{
	private int r;
	
	public Circle() {
		//생성자
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		this.r = sc.nextInt();
	}
	
	public Circle(int r) {
		super();
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", w=" + w + ", h=" + h + ", result=" + result + "]";
	}
	
	public double Width() {
		return super.result = this.r*this.r*3.14;
	}
	
	
	
}
