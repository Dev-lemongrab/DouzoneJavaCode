package ex06.staticMember;
class Atm {
	int count;
	static int total;
	
	public Atm(int amount) {
		count += amount;
		total += amount;
	}
	//static member에서 this 사용할 수 없다.
	public static void show(int count, int total) {
		//this.count = count;
		//this.total = total;
	}
	
	public void display() {
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}//Atm end
public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.display();//
		System.out.println("-------------------------");
		
		Atm at2 = new Atm(1000);
		at2.display();
		System.out.println("-------------------------");
		
		Atm at3 = new Atm(1000);
		at3.display();
		
	}
}
