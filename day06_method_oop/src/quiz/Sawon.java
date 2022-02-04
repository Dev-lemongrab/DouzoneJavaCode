package quiz;

import java.util.Scanner;

class SawonInfo {
	private String name, job, dept, salary, number;
	//생성자
	public SawonInfo() { }
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	//toString
	@Override
	public String toString() {
		return "SawonInfo [name=" + name + ", job=" + job + ", dept=" + dept + ", salary=" + salary + ", number="
				+ number + "]";
	}
	public void output() {
		System.out.println(this.toString());
	}
	public void input(String name, String job, String number, String dept, String salary) {
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.number = number;
		this.salary = salary;
	}
}

public class Sawon {
	public static void main(String[] args) {
		SawonInfo si = new SawonInfo();
		Scanner sc = new Scanner(System.in);
		
//		si.setDept("전산");
//		si.setJob("사원");
//		si.setName("오윤성");
//		si.setNumber("01");
//		si.setSalary("3,000,000");
		System.out.println("이름, 직급, 번호, 부서, 연봉 순으로 입력");
		si.input(sc.next(), sc.next(),sc.next(),sc.next(),sc.next());
		si.output();
		
	}
}
