package ex08.api;

import java.awt.Point;

public class ObjectClass {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode());
		System.out.println("Object String : " + pt.toString());
		System.out.println("Object String : " + pt);
		System.out.printf("10진수 %d\n", 0x15db9742);
		System.out.println("======================");
		
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode());
		System.out.println("Object String : " + pt2.toString());
		System.out.println("Object String : " + pt2);
		System.out.printf("10진수 %d\n", 0x15db9742);
		System.out.println("======================");
	}
}
