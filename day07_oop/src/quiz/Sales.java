package quiz;

import java.util.Scanner;

public class Sales extends Regular {
	
	private double commission;
	
	public Sales() {
		Scanner sc = new Scanner(System.in);
		this.commission = sc.nextDouble();
	}
	
	public Sales(String name, String position, String dept, String phone, int salary) {
		Scanner sc = new Scanner(System.in);
		System.out.println("커미션 입력!");
		this.commission = sc.nextDouble();
		super.name = name;
		super.position = position;
		super.dept = dept;
		super.phone = phone;
		this.salary = (int)(salary+salary*(this.commission));
	}
	
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return "영업사원 정보 [commission=" + commission + ", salary=" + salary + ", name=" + name + ", position=" + position
				+ ", dept=" + dept + ", phone=" + phone + "]";
	}
	
	
	
}
