package ex03.utilPackage;


import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
	
		System.out.print(c.get(Calendar.YEAR) + "년 ");
		System.out.print((c.get(Calendar.MONTH)+1) +"월 ");
		System.out.print(c.get(Calendar.DATE) + "일");
		System.out.println("\n==========================");
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재시간은 " + h + ":" + m + ":" + s);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
//		c2.set(2018, 12,20,0,0);
		c2.set(2022, 12, 20, 0, 0);
		
		if(c1.after(c2)) {
			System.out.println("현재 시간은 2022년 1월 1일 이후입니다.");
		}else if(c1.before(c2)) {
			System.out.println("현재시간은 2022년 1월 1일 이전입니다.");
		}else if(c1.equals(c2)){
			System.out.println("현재시간은 2022년 1월 1일 입니다.");
		}
	}
}
