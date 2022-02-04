package ex01.oop;

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setX(100);
		c.setY(100);
		c.setR(5);
		c.disp();
		System.out.println("========================");
		
		Point pt = new Point();//객체 생성, 메모리에 할당, 생성자 함수 자동호출
		pt.disp();
		pt.setX(5); pt.setY(10);pt.disp();
		
	}
}
