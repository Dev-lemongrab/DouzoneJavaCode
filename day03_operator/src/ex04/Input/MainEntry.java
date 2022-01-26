package ex04.Input;

//import.java.lang.*; 자동으로 임포트 해준다.
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi~~~");
		System.out.println("integer, double, char data input ===>");
		//int x = sc.nextInt();
		
		
		String num = sc.next();
		
		int[] cntAndsum = CountSum(num);
		String YesOrNo = (cntAndsum[1]%3==0&&cntAndsum[1]!=0)? "YES": "NO";
		
		System.out.println(cntAndsum[0]);
		System.out.println(YesOrNo);
	}
	public static int[] CountSum(String num) {
		
		int cnt = 0;
		int sum = 0;
		
		do {
			sum = 0;
			if(num.length()>1) {//10의 자릿수 이상 입력값들어왔을때
				for(int i = 0 ; i < num.length() ; i ++) {
					sum += Integer.parseInt(num.charAt(i)+"");
				}
				num = sum+"";
				cnt++;
			}else {//1의 자릿수가 들어왔을 때 
				sum = Integer.parseInt(num);
				break;
			}
		} while (sum > 0);
		
		return new int[] {cnt, sum};
	}

}
