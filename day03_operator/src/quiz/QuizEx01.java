package quiz;

public class QuizEx01 {
	//오윤성
	public static void main(String[] args) {
		// %, / 산술연산자 이용한 계산결과 출력하기 
		int pay = 567890;
		
		int tenthousand = 0;
		int thousand = 0;
		int hundred = 0;
		int ten = 0;
		
//		tenthousand = pay/10000;
//		pay %= 10000;
//		thousand = pay/1000;
//		pay %=1000;
//		hundred = pay/100;
//		pay %=100;
//		ten = pay/10;
		
		System.out.println("result : ");
		System.out.println("만원 : "+tenthousand +"장");
		System.out.println("천원 : "+thousand +"개");
		System.out.println("백원 : "+ hundred+ "개");
		System.out.println("십원 : "+ ten+ "개");
	}
}
