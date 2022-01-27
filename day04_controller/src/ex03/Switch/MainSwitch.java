package ex03.Switch;

import java.util.Scanner;
/*/
public class MainSwitch {
	public static void main(String[] args) {
		System.out.print('도시를 선택하세요(s,d,b,j) = ');
		String ch = new Scanner(System.in).next();
		
		switch(ch) {//조건-문자형, 정수형(long형 제외), 실수형 안됨
		case 's':
			System.out.print('서울');
			break;
		case 'd':
			System.out.print('대구');
			break;
		case 'b':
			System.out.print('부산');
			break;
		case 'j':
			System.out.print('제주');
			break;
		default:
			System.out.print('잘못선택하셨습니다. s,d,b,j 중에서만 선택하세요.');
			System.exit(0);
		}
		System.out.println('를(을) 선택하셨습니다.');
	}
}
//*/
//*/
public class MainSwitch {
	public static void main(String[] args) {
		System.out.print("도시를 선택하세요(s,d,b,j) = ");
		char ch = new Scanner(System.in).next().charAt(0);//스트링형태로 받은뒤 캐릭터형 하나 선택
		
		switch(ch) {//조건-문자형, 정수형(long형 제외), 실수형 안됨
		case 's':
			System.out.print("서울");
//			break;
		case 'd':
			System.out.print("대구");
//			break;
		case 'b':
			System.out.print("부산");
//			break;
		case 'j':
			System.out.print("제주");
//			break;
		default:
			System.out.print("잘못선택하셨습니다. s,d,b,j 중에서만 선택하세요.");
			System.exit(0);
		}
		System.out.println("를(을) 선택하셨습니다.");
	}
}
//*/
