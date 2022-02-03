package ex04.staticMethod;

/*
 * static method : 객체생성 없이 바로 사용가능함
 * 	object.methodName();
 * 	ClassName.methodName();
 */
class A {
	int x, y ;
	//static method
	public static void setData(int xx, int yy) {
		System.out.println(xx + "," + yy);
	}
}//A class end

public class MainEntry {
	public static void main(String[] args) {
		A obj = new A();//객체 생성, 메모리에 할당, 생성자 함수 자동호출
		obj.x = 9;
		System.out.println(obj.x);
		A.setData(10, 20);
		
	}
}
