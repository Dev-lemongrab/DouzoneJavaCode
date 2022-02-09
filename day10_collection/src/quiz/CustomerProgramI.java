package quiz;

import java.util.ArrayList;

public interface CustomerProgramI {
	public void Operation(CustomerProgram customerProgram);
	public void add(CustomerProgram customerProgram);
	public void del(ArrayList<Customer> customerList);
	public void modify(ArrayList<Customer> customerList);
	public void print(ArrayList<Customer> customerList);
}
