package ex05.InstanceMethod;

/*
 * Instance method : 객체 생성하고 사용해야함(메모리상에 할당이 되어야...)
 */
class B {
	int x, y;
	//instance method
	public void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
}//B class end
public class MainEntry {
	public static void main(String[] args) {
		B b = new B();
		b.setData(20, 50); 
	}
}
