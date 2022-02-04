package quiz;

import java.util.Scanner;

public class MainQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Triangle tri = new Triangle();
		//생성자로 초기화
		System.out.println("밑변길이와 높이 입력");
		Triangle tri2 = new Triangle(sc.nextInt(), sc.nextInt());
		
		//넓이 구하기
		tri.Width();
		tri2.Width();
		//출력
		tri.Output();
		tri2.Output();
		System.out.println("====================");
		
		Circle c = new Circle();
		//생성자로 초기화
		System.out.println("반지름 입력");
		Circle c2 = new Circle(sc.nextInt());
		
		//넓이구하기
		c.Width();
		c2.Width();
		//출력
		c.Output();;
		c2.Output();
		
		
	}
}
