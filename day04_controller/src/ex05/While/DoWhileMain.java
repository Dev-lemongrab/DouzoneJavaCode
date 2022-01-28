package ex05.While;

import java.util.Scanner;

public class DoWhileMain {
	public static void main(String[] args) {
		//su 정수 데이터 1개 입력 받아서 0~100 사이값만 입력 받아 출력하는 프로그램 작성 (do~while)
		int i =0;
		do{
			System.out.println("0~100사이의 숫자를 입력해주세요!");
			i = new Scanner(System.in).nextInt();
			System.out.println("입력하신 숫자는 " +i+" 입니다.");
		}while(i<=100 && i>=0);
		System.out.println("0~100사이로 다시입력해주세요");
	}
}
