package array_quiz;

import java.util.Scanner;

public class QuizEx01 {
	public static void main(String[] args) {
		System.out.println("문제 1"); 
		int[] a = {1,7,5,7,2,8,7,9,12,5,7,99}; int seek = 7;
		int cnt = 0;
		for(int i = 0; i< a.length; i++) {
			if(seek==a[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		//문제 2 기상청 1월 평균강수량 구하는 프로그램 작성(단, 30일 기준)
		int NUM = 30;
		double avg = 0;
		double[] dailyRain = new double[NUM];
		Scanner sc = new Scanner(System.in);
		for(int i =0 ; i<NUM ;i++ )
			dailyRain[i] = sc.nextDouble();
		//30일간 강수량을 받음 
		for(int i = 0; i <dailyRain.length;i++) {
			avg += dailyRain[i]/NUM;
		}

	}
}
