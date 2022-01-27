package ex04.For;

public class MainEntry {
	public static void main(String[] args) {
//		for(int i = 0; i<10 ;i++) {
//			if(i%10==0)System.out.println();
//			System.out.print((i+1)+"\t");
//		}//for end
		//문제1 : 1~ 100까지 중에서 3의 배수의 개수와 합을 구하는 프로그램 작성
		int sum, count; sum=count=0;
		
		for(int i = 0; i< 101 ; i++) {
			if(i%3==0) {
				count++;
				sum+=i;
			}
		}//for end
		
		System.out.println("1~100까지 중에서 3의 배수 개수와 합 = " + count + sum);
		
	}
	
}
