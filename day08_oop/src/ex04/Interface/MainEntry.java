package ex04.Interface;

import ex02.Abstract.Shape;

public class MainEntry {
	public static void main(String[] args) {
		//2. super
		Shape s = new MultiClass();
		s.calc(5.5);
		s.show("도형이야");
		s.view();
		
		Test t = new MultiClass();
		t.tView();
		System.out.println(t.str);
		
		//1.
		MultiClass mc = new MultiClass();
		mc.draw();
		System.out.println(mc.su);
		System.out.println(mc.num);
	}
}
