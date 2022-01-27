package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("Integer data input : ");
//		int point = new Scanner(System.in).nextInt();
		double point = new Scanner(System.in).nextDouble();
		
//		int point=(int)point2;
		
		switch((int)point) {//조건-문자형, 정수형(long형 제외), 실수형 안됨
		case 1:
			System.out.println("포인트 점수 1점 입니다.");
			break;
		case 2:
			System.out.println("포인트 점수 2점 입니다.");
			break;
		case 3:
			System.out.println("포인트 점수 3점 입니다.");
			break;
		default:
			System.out.println("없는 점수 입니다. 1~3까지만 입력 요망");
		}
	}
}
