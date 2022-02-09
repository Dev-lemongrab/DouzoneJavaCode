package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerProgram implements CustomerProgramI{
	
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
		CustomerProgram  customerProgram = new CustomerProgram();
		customerProgram.Operation();
	
	}

	@Override
	public void Operation(CustomerProgram customerProgram) {
		int option = sc.nextInt();
		try {
			System.out.println("안녕하세요 고객프로그램입니다.");
			System.out.println("원하시는 서비스를 입력해주세요!\n1 : 고객등록\n2 : 고객삭제 \n3. 고객수정 \n4. 고객리스트조회 \n5. 아무 키 입력 : 프로그램종료");
			switch (option) {
				case 1:
					System.out.println("고객을 등록하겠습니다.");
					
					
					break;
				case 2:
					System.out.println("고객을 삭제하겠습니다.");
					break;
				case 3:
					System.out.println("고객을 수정하겠습니다.");
					break;
				case 4:
					System.out.println("고객리스트 조회");
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
	public void add(Customer customer) {
		
	}

	@Override
	public void del(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub
		
	}

	


}



