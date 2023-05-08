package basic.BankingApp;

public abstract class Customer {
	String customerId;
	String customerName;
	String customerType;
	
	Customer(String customerId, String customerName, String customerType){
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerType = customerType;
	}
	
	void showCustomerDetails() {
		System.out.println("customer Id : " + this.customerId);
		System.out.println("customer Name : " + this.customerName);
		System.out.println("customer Type : " + this.customerType);
	}
	
	abstract double get_final_amount(double interest, int year);
}
