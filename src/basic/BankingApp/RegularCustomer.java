package basic.BankingApp;

public class RegularCustomer extends Customer{

	//Class Variables
	String customerId;
	String customerName;
	String customerType;
	double amount;
	
	//constructor
	RegularCustomer(String customerId, String customerName, String customerType, double amount){
		
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
		
		if(this.customerType == "Domestic") {
			//For regular customer we are discount 500 rupees
			return amount - 500;
		}
		
		else if(this.customerType == "Bussiness") {
			//for business no discount
			return amount;
		}
		
		// besides the above customer types we will return the amount calculated
		return amount;
	}
}
