package basic.BankingApp;

public class EnterpriseCustomer extends Customer{
	//Class Variables
	String customerId;
	String customerName;
	String customerType;
	double amount;
	
	//constructor
	EnterpriseCustomer(String customerId, String customerName, String customerType, double amount){
		
		super(customerId, customerName, customerType);
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerType = customerType;
		this.amount = amount;
	}
	
	//method
	double get_final_amount(double interest, int year) {
		double simple_interst = this.amount * interest * year;
		double amount = this.amount + simple_interst;
		
		// flat 500 discount for all the enterprise customer
		amount = amount - 500;
		if(this.customerType == "SmallScale") {
			//For SmallScale customer we are discount 100 rupees
			return amount - 100;
		}
		
		else if(this.customerType == "BigScale") {
			//for BigScale customer no discount
			return amount;
		}
		
		// besides the above customer types we will return the amount calculated
		return amount;
	}
}
