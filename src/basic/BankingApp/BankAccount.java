package basic.BankingApp;

public class BankAccount {

	public static void main(String[] args) {
		RegularCustomer regularCustomerOne = new RegularCustomer("R123", "Ram", "Domestic", 123456);
		RegularCustomer regularCustomerTwo = new RegularCustomer("R1234", "Ram", "Bussiness", 234366);
		EnterpriseCustomer enterpriseCustomerOne = new EnterpriseCustomer("E123", "Shayam", "SmallScale", 7621);
		EnterpriseCustomer enterpriseCustomerTwo = new EnterpriseCustomer("E1234", "Shayam", "BigScale", 3476);
		
		
		regularCustomerOne.showCustomerDetails();
		System.out.println("Final amount : " + regularCustomerOne.get_final_amount(5, 8));
		regularCustomerTwo.showCustomerDetails();
		System.out.println("Final amount : " + regularCustomerTwo.get_final_amount(7, 4));
		
		enterpriseCustomerOne.showCustomerDetails();
		System.out.println("Final amount : " + enterpriseCustomerOne.get_final_amount(5, 8));
		enterpriseCustomerTwo.showCustomerDetails();
		System.out.println("Final amount : " + enterpriseCustomerTwo.get_final_amount(7, 4));
	}
}
