package ex02.Interface;

public class Rect extends Point {// Sub : 자손 Super : 부모

	private int x2, y2;
	public Rect() {
		x=y=x2=y2=100;
	}

	public int getX2() {
		return x2;
	}


	public void setX2(int x2) {
		this.x2 = x2;
	}


	public int getY2() {
		return y2;
	}


	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public String toString() {
		return "Rect [x2=" + x2 + ", y2=" + y2 + ", x=" + x + ", y=" + y + "]";
	}


//	@Override
//	public void disp() {
//	
//		System.out.println("x : " + x + "\ty : " + y  + "\tx2 : " + x2 + "\ty2 : " + y2);
//	}
//
//	public String toString() {
//		String str = "x : " + x + "\ty : " + y  + "\tx2 : " + x2 + "\ty2 : " + y2;
//		return str;
//	}
	

}
