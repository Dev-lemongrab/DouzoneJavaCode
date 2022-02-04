package quiz;

import java.util.Scanner;

public class Parttime extends Employee {
	private double hour;
	private double payPerTime;
	private double pay;
	
	public Parttime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("시간입력");
		this.hour = sc.nextDouble();
		System.out.println("시급입력");
		this.payPerTime = sc.nextDouble();
		this.pay = hour*payPerTime;
	}
	
	public Parttime(String name, String position, String dept, String phone) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시간입력");
		this.hour = sc.nextDouble();
		System.out.println("시급입력");
		this.payPerTime = sc.nextDouble();
		super.name = name;
		super.position = position;
		super.dept = dept;
		super.phone = phone;
		this.pay = hour*payPerTime;
	}
	
	
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	public double getPayPerTime() {
		return payPerTime;
	}
	public void setPayPerTime(double payPerTime) {
		this.payPerTime = payPerTime;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "알바생 정보 [hour=" + hour + ", payPerTime=" + payPerTime + ", pay=" + pay + ", name=" + name
				+ ", position=" + position + ", dept=" + dept + ", phone=" + phone + "]";
	}
	
	
	


	
}
