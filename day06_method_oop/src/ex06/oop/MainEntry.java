package ex06.oop;

class Point {
	
	private int x,y;
	
	public int getX() {return x;}
	public void setX(int xx) {x = xx;}
	
	public int getY() {return y;}
	public void setY(int yy) {y = yy;}
	
	public void disp() {
		System.out.println(x+ "," + y);
		System.out.println(getX()+ "," + getY());
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		
//		System.out.println(pt.getX() + ", " + pt.getY());
		pt.disp();
		pt.setX(90);
		pt.setY(80);
		pt.disp();
		
	}
}
