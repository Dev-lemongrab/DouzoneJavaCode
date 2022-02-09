package quiz;

import java.util.ArrayList;

public interface CustomerProgramI {
	public void Operation(CustomerProgram customerProgram);
	public void add();
	public void del(Customer customer);
	public void modify(Customer customer);
	public void print(ArrayList<Customer> customerList);
}
