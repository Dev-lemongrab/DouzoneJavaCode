package ex03.Interface;

interface A {//interface - abstract method, final field만 갖는다. 
	int x = 9; //final static int x = 90;
	final int y = 7777;
	char ch = 'A';
	//
	public void show();
	public abstract void disp();
}//A end

interface B {
	void bView();
}//B end

interface C {
	String name ="happy";
	public void draw();
}//C end

interface D extends B{//interface 간 상속에 extends 사용
	void dView();
}//D end

class Rect implements D {

	@Override
	public void bView() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dView() {
		// TODO Auto-generated method stub
		
	}
	public int plus(int x, int y) {
		return x + y;
	}
	
}//Rect end


class Shape {
	
}//shape end

class Multi extends Shape implements B,C,A {

	@Override
	public void show() {
		System.out.println(x+y);
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bView() {
		// TODO Auto-generated method stub
		
	}
	
}


public class MainEntry {
	public static void main(String[] args) {
		
	}
}
