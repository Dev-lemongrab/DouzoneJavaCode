package ex01.Abstract;

abstract class Shape{//추상클래스
	double result = 0;
	public abstract double calc();
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape");
	}
}//Shape end
class Circle extends Shape {
	double r = 5.0;
	@Override
	public double calc() {
		result = r*r *Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의넓이 : " + result + "인 원을 그렸습니다.");
	}
	
}
//triangle
class Triangle extends Shape {
	int w = 5, h =10;
	@Override
	public double calc() {
		result = (w * h)/2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + "인 삼각형을 그렸습니다.");
		
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		//shape sh = new Shape(); //자체적으로 객체 생성할 수 없다.
		Shape sh = new Circle();//협소하게 접근한다.//상속받은 자손클래스로는 객체생성가능
		sh.calc();
		sh.draw();
		
		Circle c = new Circle();
		c.draw();
		
		Triangle t = new Triangle();
		t.draw();
	}
}
