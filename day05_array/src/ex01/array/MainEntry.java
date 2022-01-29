package ex01.array;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {

		char[] ch;
		
		char[] ch2 = new char[4];
		ch2[0]='J';
		ch2[1]='A';
		ch2[2]='V';
		ch2[3]='A';
		System.out.println(ch2[0]);
		System.out.println(ch2[3]);
		System.out.println("=======");
		for(int i =0 ; i<4 ; i++) System.out.println(ch2[i]);
		
		char[] ch3 = {'a', 'k','P','D','y','R','7','u','5','3','g'};//초기화
		System.out.println(ch3[1]);
		System.out.println("array length : " +ch3.length);
		for(int i = 0; i<ch3.length;i++) System.out.println(ch3[i]);
		
		System.out.println("===============");
		String [] str = {"a","kbs", "Park", "D", "you"};
		for (int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
	
		
		
	}
}	
