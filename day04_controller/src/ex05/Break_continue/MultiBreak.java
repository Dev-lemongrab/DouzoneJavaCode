package ex05.Break_continue;

public class MultiBreak {
	
	public static void main(String[] args) {
		boolean flag = true;
		first :{
			second:{
				third: {
					int k = 100;
					System.out.println("Before the break");
					if(flag) break second;//break 뒤에 어디 구간 끝낼지 써주면 된다. 
					System.out.println("This won't execute");
				}//end third
				System.out.println("우리반 홧팅");
			}//end second
		System.out.println("This is after second block");
		}//end first
		
	}
	
	
//	식별자: {
//		식별자 : {
//			break 식별자;
//		}
//
//
//	}
}
