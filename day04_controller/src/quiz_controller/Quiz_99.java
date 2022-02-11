package quiz_controller;

import java.util.Scanner;

public class Quiz_99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan; boolean flag = true;
		while(flag) {
			System.out.println("원하는 구구단 단수를 입력해주세요");
			dan = sc.nextInt();
			System.out.println(dan +"단");
			for(int i=1; i <=9 ;i++) {
				System.out.println(dan+" * "+i+" = " + dan*i);
			}
			System.out.println("계속 : 아무거나\n종료 : y");
			if(sc.next().equals("y")) flag = false;
		}
		
	}

}
