package ex07.Enum;
/*
 * enum 열거형 - 새로운 클래스 타입을 정의하는것.
 */
enum UserStatus {
	PENDING,
	ACTIVE,
	INACTIVE,
	DELETE;
}
enum DAY{
	SUNDAY, MONDAY, TUESDAY
}

public class MainEntry {
	DAY day;
	public MainEntry(DAY day) {
		this.day = day;
	}
	public void tells() {
		switch(day) {
		case SUNDAY : System.out.println("일요일");
			break;
		default:
			break;
		}		
	}
	public static void main(String[] args) {
		//1.
		System.out.println(UserStatus.ACTIVE);
		System.out.println("----------------------");
		
		//2.
		for (UserStatus status : UserStatus.values()) {
			System.out.println(status);
		}
		//3.
		DAY day = DAY.SUNDAY;
		MainEntry m = new MainEntry(day);
		m.tells();
			
		
	}
}
