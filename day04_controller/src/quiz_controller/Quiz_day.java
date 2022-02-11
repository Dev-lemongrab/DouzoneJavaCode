package quiz_controller;

import java.util.Scanner;

//달의 날자수를 출력해주는 프로그램 만들기 
//윤년인지 아닌지 확인해서 2월 날짜 설정
//switch case 사용

public class Quiz_day {
	public static void main(String[] args) {
		System.out.println("년도 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean flag = false;
		if((year % 4 == 0) && ((year %100 != 0) || (year % 400 ==0))) flag = true;
		System.out.println((flag)? "평년":"윤년");
			
	}
}
