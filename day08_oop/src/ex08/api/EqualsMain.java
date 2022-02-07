package ex08.api;

class Circle {
	int x, y;
}
public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		System.out.println("c1 : " + c1.hashCode());
		System.out.println("c2 : " + c2.hashCode());
		
		int x = 3, y = 3;
		System.out.println("기본자료형 비교");
		if(x == y) {
			System.out.println("같다");
		}else System.out.println("다르다");
		
		System.out.println("참조자료형 비교");
		String str1 = new String("kosa");
		String str2 = new String("kosa");

		if(str1 == str2) {
			System.out.println("같다");
		}else System.out.println("다르다");
		
		System.out.println("**** equals() method 비교 ****");
		if(str1.equals(str2)) System.out.println("같다");
//		if(str1.equalsIgnoreCase(str2)) System.out.println("같다");
		else System.out.println("다르다");
	}
}
