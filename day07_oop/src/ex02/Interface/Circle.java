package ex02.Interface;

public class Circle extends Point{
	
	private int r;
	
	public Circle() {
		x=y=10;
	}
	
	public Circle(int x, int y) {
		super(x,y);//첫 줄에 와야한다. 
		System.out.println("Circle2");
	}
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void disp() {
		System.out.println("x : " + x + "\ty : " + y +"\tr : " +r);
	}
	
	
}
