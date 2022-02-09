package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerProgram implements CustomerProgramI{
	//프로그램 생성시 arraylist를 생성하는 객체 
	Scanner sc = new Scanner(System.in);
	ArrayList<Customer> CustomerList;
	public CustomerProgram() {
		CustomerList = new ArrayList<Customer>();
	}
	
	
	public ArrayList<Customer> getCustomerList() {
		return CustomerList;
	}


	public void setCustomerList(ArrayList<Customer> customerList) {
		CustomerList = customerList;
	}


	public static void main(String[] args) {
		CustomerProgram  customerProgram = new CustomerProgram();//커스토머 프로그램 생성->어레이리스트가 생김
		while(true) {
			customerProgram.Operation(customerProgram);//프로그램 작동!
		}
	}
	@Override
	public void Operation(CustomerProgram customerProgram) {
		try {
			System.out.println("안녕하세요 고객프로그램입니다.");
			System.out.println("원하시는 서비스를 입력해주세요!\n1 : 고객등록\n2 : 고객삭제 \n3 : 고객수정 \n4 : 고객리스트조회 \n아무 키 입력 : 프로그램종료");
			int option = sc.nextInt();
			switch (option) {
				case 1:
					System.out.println("고객을 등록하겠습니다.");
					add(customerProgram);
					break;
				case 2:
					System.out.println("고객을 삭제하겠습니다.\n");
					del(customerProgram.getCustomerList());
					break;
				case 3:
					System.out.println("고객을 수정하겠습니다.");
					modify(customerProgram.getCustomerList());
					break;
				case 4:
					System.out.println("고객리스트 조회");
					print((customerProgram.getCustomerList()));
					break;
				default:
					System.out.println("종료합니다.");
					System.exit(0);
					break;
			}
			
		} catch (Exception e) {
			//아무키를 입력하면 예외발생
			sc = new Scanner(System.in);
			System.out.println("종료합니다.");
			System.exit(0);
			
		}
	}
	@Override
	public void add(CustomerProgram customerProgram) {
		
		System.out.println("등록할 손님을 입력해 주세요!");
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("주소 : ");
		String address = sc.next();
		System.out.println("전화번호 : ");
		String phone = sc.next();
		
		Customer customer = new Customer(name, address, phone);
		customerProgram.getCustomerList().add(customer);
		
		
	}

	@Override
	public void del(ArrayList<Customer> customerList) {
		System.out.println("삭제할 고객번호를 말씀해주세요!");
		boolean flag = true;
		while(flag) {//예외처리
			if(customerList.isEmpty()) {//고객이 없으면 삭제 기능 끄기 
				System.out.println();
				System.out.println("더이상 고객이 존재하지 않습니다.");
				System.out.println();
				break;
			}
			try {//inputexception 방지 
				int num = sc.nextInt();
				for (int i = 0; i < customerList.size(); i++) {
					if((customerList.get(i).getIdentify()== num)) {
						customerList.remove(i);
						System.out.println("삭제완료!");
						System.out.println();
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.println("번호를 확인해주세요!");
				}
			} catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("숫자만 입력하셔야 합니다!");
			}
		}
	}

	@Override
	public void modify(ArrayList<Customer> customerList) {
		System.out.println("수정할 고객번호를 입력해주세요");
		boolean flag = true;
		while(flag) {
			try {
				int num = sc.nextInt();
				for (int i = 0; i < customerList.size(); i++) {
					if(customerList.get(i).getIdentify()==num) {
						Customer c = customerList.get(i);//객체를 갖고오고					
						customerList.remove(i);//삭제한다.
						System.out.println("이름 입력");
						c.setName(sc.next());
						System.out.println("주소입력");
						c.setAddress(sc.next());
						System.out.println("전화번호 입력");
						c.setPhone(sc.next());
						customerList.add(c);//그리고 다시 넣어준다.
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.println("회원번호를 확인해주세요!");
				}
			} catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("숫자만 입력하셔야 합니다!");
			}
		}
		
	}

	@Override
	public void print(ArrayList<Customer> customerList) {
		System.out.println();
		System.out.println();
		System.out.println("=====고객정보를 출력합니다=====");
		for (int i = 0; i < customerList.size(); i++) {
			System.out.println(customerList.get(i));
			System.out.println("-------------------------");
		}
		System.out.println();
		System.out.println();
	}

	


}



