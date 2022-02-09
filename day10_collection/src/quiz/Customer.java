package quiz;

public class Customer {
	static int number;//프라이머리키로 활용
	int Identify;
	String name;
	String address;
	String phone;
	


	public Customer(String name, String address, String phone) {
		number++;
		this.Identify = number;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	
	public int getIdentify() {
		return Identify;
	}


	public void setIdentify(int identify) {
		Identify = identify;
	}


	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "고객정보\n회원번호 = " + Identify +"\n이름 = " + name + "\n주소 = " + address + "\n전화번호 = " + phone;
	}
	
	
}
