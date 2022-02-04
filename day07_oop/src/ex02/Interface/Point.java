package ex02.Interface;

public class Point {
	protected int x, y;
	public Point() {//default
		this(3,5);//항상 첫줄에 와야한다. super()도 마찬가지라서 동시에 쓸 수 없다.
		x=y=20;
		System.out.println("Point default");
	}
	public Point(int x) {//1 생성자 재정의를 하면 default 생성자가 기능을 상실하기 때문에
		System.out.println("Point1");//default생성자를 쓰려면 꼭 정의 해주기!
		this.x = x;
		y =9;
	}
	public Point(int x, int y) {//2
		System.out.println("Point3");
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
//	public void disp() {
//		System.out.println("x : " + x + "\ty : " + y);
//	}
	@Override
	public String toString() {
		String str = "x : " + x + "\ty : " + y;
		return str;
	}
}
