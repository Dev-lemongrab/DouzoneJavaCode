package ex05.foreach;
//확장 for문
//for(자료형 변수명 : 컬렉션명 or 배열명) {
//	반복구문;
//}
public class MainEntry {
	public static void main(String[] args) {
		int[]a = {7,3,5,2,8,100,80,90};
		System.out.println("******for 출력");
		for(int i = 0 ;i <a.length ; i++) {
			System.out.println(a[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i <a.length; i++) {
			System.out.println(a[i] + "\t");
			if(i==3) break;
		}
		//for(자료형 변수명 : 컬렉션명 or 배열명) { 반복구문; }
		System.out.println("\t******foreach 출력");
		for(int item : a) {
			System.out.println(item + "\t");
		}
		System.out.println("\n내립차순");
		for (int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i] +"\t");
		}
		
	}
}
