package quiz_controller;

import java.util.Scanner;

public class Quiz_Asc345 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3,4,5 무작위 입력");
		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
//		//논리연산, if활용
//		if(a>b && a>c) {
//			System.out.println(a);
//			if(b>c) {
//				System.out.println(b); 
//				System.out.println(c);}
//			else { 
//				System.out.println(c); 
//				System.out.println(b);
//			}
//		}
//		if(b>a && b>c) {
//			System.out.println(b);
//			if(a>c) {
//				System.out.println(a); 
//				System.out.println(c);}
//			else { 
//				System.out.println(c); 
//				System.out.println(a);
//			}
//		}
//		if(c>a && c>b) {
//			System.out.println(c);
//			if(a>b) {
//				System.out.println(a); 
//				System.out.println(b);}
//			else { 
//				System.out.println(b); 
//				System.out.println(a);
//			}
//		}
		//알고리즘 버블정렬
		int[] asc = {a,b,c}; 
		int temp=0;
		for(int i = 0; i < asc.length-1; i++) {
			boolean flag = true;
			for(int j = 0 ; j < asc.length-1-i; j++ ) {
				if(asc[j]<asc[j+1]) {
					temp=asc[j];
					asc[j]=asc[j+1];
					asc[j+1]=temp;
					flag=false;
				}
			if(flag) break;//if문에 안들어가면 이미 정렬이 된것.
			}
		}
		for(int i : asc) System.out.print(i+" ");
		
		
	}
}
