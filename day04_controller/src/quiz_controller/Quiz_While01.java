package quiz_controller;

public class Quiz_While01 {
	//1+ 1+2 + 1+2+3 +...+ 5까지
	//-1 + 2 + -3 + 4 + -5 ..+ 10까지
	//1/2+ 2/3+ 3/4 + 4/5 + ...10까지
	public static void main(String[] args) {
		System.out.println("첫번째 문제");
		int sum = 0;
		int finSum = 0;
		int i = 1;
		while(i<=5) {
			sum += i;//1 3
			finSum += sum;//1 12 123
			i++;
		}
		System.out.println("결과 : " + finSum);
		
		System.out.println("두번째 문제");
		int sum2 = 0;
		int j = 1;
		
		while(j <= 10) {
			if(j%2 != 0) {
				sum -= j;
			}else {
				sum += j;
			}
			
		}
		
		System.out.println("결과 : " + sum2);
		
		System.out.println("세번쨰 문제");
		int k = 1;
		double sum3 = 0;
		while(k<10) {
			sum3 += (double)k/(k+1);
			k++;
		}
		System.out.println("결과 : " + sum3);
	}
	
}
