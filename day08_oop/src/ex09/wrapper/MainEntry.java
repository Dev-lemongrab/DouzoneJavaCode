package ex09.wrapper;

import java.awt.Point;

public class MainEntry {
	public static void main(String[] args) {
		Integer Ia = new Integer(10);
		Integer Ib = new Integer("10");
		
		String su = "30";
		Point pt = new Point();
		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(Ia);
		System.out.println();
		//Boxing vs UnBoxing 
		//jdk 4 이전에는 autoBoxing 불가
		//jdk 5 이후부터 autoboxing unboxing 
		int c = Ia.intValue();
		int d = Ib;
		System.out.println("----------------");
		System.out.println(c+ " " +d);
		int num = Integer.parseInt(su);
		System.out.println(c + num);
		System.out.println(c+d);
		System.out.println(Ia.MAX_VALUE);
		System.out.println(Ia.MIN_VALUE);
		Double dd = new Double(12.34);
		System.out.println(dd);
		System.out.println(dd.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println("===================");
		c = (int)dd.doubleValue();
		System.out.println(c);
		System.out.println("====================");
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("11111",2);
		System.out.println(e+20);
		System.out.println(f);
		
		int xx =3;
		Integer yy = new Integer(3);
	}
}
