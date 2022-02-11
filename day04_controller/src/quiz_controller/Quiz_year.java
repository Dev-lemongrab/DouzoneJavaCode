package quiz_controller;

import java.util.Scanner;

public class Quiz_year {
	public static void main(String[] args) {
		//윤년구하는 프로그램
		//다시 제출합니다!!
				Scanner sc = new Scanner(System.in);

//				while(true) {
//					System.out.println("연도를 입력해주세요!");
//					int year = sc.nextInt();
//					String CommonOrNot = "";
//					if(year <=1000) {
//						System.out.println("연도를 다시 입력해주세요");
//						continue;
//					}
//					if(year % 4 == 0) {
//						if((year %100 != 0) || (year % 400 ==0)) CommonOrNot = "윤년";
//						else CommonOrNot = "평년";	
//					}else {
//						CommonOrNot="평년";
//					}
//					System.out.println("해당 년도는 "+ CommonOrNot + "입니다");
//					
//				}
				System.out.println("년도 입력하세요 ");
				int year = sc.nextInt();
				boolean flag = false;
				if((year % 4 == 0) && ((year %100 != 0) || (year % 400 ==0))) flag = true;
				System.out.println((flag)? "평년":"윤년");
					
				
				
				
				
				
	}
}
