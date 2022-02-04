package quiz;

public class Regular extends Employee {
	
	protected int salary;
	
	public Regular() {
		// TODO Auto-generated constructor stub
	}
	
	public Regular(String name, String position, String dept, String phone, int salary) {
		super.name = name;
		super.position = position;
		super.dept = dept;
		super.phone = phone;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "정규직 사원정보 [salary=" + salary + ", name=" + name + ", position=" + position + ", dept=" + dept + ", phone="
				+ phone + "]";
	}
	
	
	
}
