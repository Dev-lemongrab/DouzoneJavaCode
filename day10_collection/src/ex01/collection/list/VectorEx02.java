package ex01.collection.list;

import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import javax.xml.crypto.Data;



public class VectorEx02 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5);
		
		v.addElement("자바");
		v.addElement(new Double(10.2));
		v.addElement(date);
		
		System.out.println("size : " + v.size() + ", capacity : " +v.capacity());
		for (i = 0; i < 10; i++) {
			v.addElement(new Integer(i));
		}
		
		System.out.println("-----------10개 객체에 추가--------------");
		System.out.println("size : " + v.size() + ", capacity : " +v.capacity());
		
		System.out.println("-----------Vector 내용출력--------------");
		Enumeration e =  v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("-------------객체-----------------");
		if(v.contains("자바")) System.out.println("자바 문자열 포함됨");
		
		System.out.println("10.2 객체의 위치는 ? " +v.indexOf(new Double(10.2)));
		
		//date 객체 삭제
		v.removeElementAt(v.indexOf(date));
		System.out.println("size : " + v.size() + ", capacity : " +v.capacity());
		System.out.println(v);
		
		for (i = 0; i < v.size(); i++) {
//			v.removeAllElements();
			v.remove("자바");
//			v.removeElementAt(i);
		}
		System.out.println("size : " + v.size() + ", capacity : " +v.capacity());
		System.out.println(v);
		
	}
}
