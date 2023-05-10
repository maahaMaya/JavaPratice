package assigment;

import java.util.Scanner;

public class MovieTicketCalulation {
	//price(Rs) of the ticket item
	static final int KING_TICKET_PRICE = 75;
	static final int QUEEN_TICKET_PRICE = 150;
	static final int REFRESHMENT_PRICE = 50;
	static final int BULK_DISCOUNT_PRICE = 50;
	static final int COUPON_DISCOUNT_PRICE = 50;
	public static void main(String[] args) {
		// initialize variables
		int totalTicketQuantity;
		char refreshmentNeed;
		char couponCodeAvailabe;
		char circleLocation;

		
		Scanner sc = new Scanner(System.in);
		//taking the customer input for food
		System.out.print("Enter the number of pizza bought : ");
		totalTicketQuantity = sc.nextInt();
		System.out.print("Do you want refreshment : ");
		refreshmentNeed = sc.next().charAt(0);
		System.out.print("Do you have coupon code : ");
		couponCodeAvailabe = sc.next().charAt(0);
		System.out.print("Enter the circle location : ");
		circleLocation = sc.next().charAt(0);
		
		if(totalTicketQuantity >= 4 && totalTicketQuantity <= 40) {
			double refreshmentPrice = totalTicketQuantity * REFRESHMENT_PRICE;
			double totalTicketPrice;
			if(circleLocation == 'k') {
				totalTicketPrice = ((totalTicketQuantity * KING_TICKET_PRICE) +  refreshmentPrice);
				System.out.println(totalTicketPrice);
				//totalTicketPrice = ((totalTicketPrice) * (10%100)); 
				System.out.println("D" + (float)(10.0 / 100.0));
				if(couponCodeAvailabe == 'y') {
					totalTicketPrice = ((totalTicketPrice) * (2/100));
				}
				System.out.println("Total cost : " + totalTicketPrice);
			}
			else if(circleLocation == 'q') {
				totalTicketPrice = ((totalTicketQuantity * QUEEN_TICKET_PRICE) - ((totalTicketQuantity * QUEEN_TICKET_PRICE)/0.2));
				if(couponCodeAvailabe == 'y') {
					totalTicketPrice = (totalTicketPrice - (totalTicketPrice/0.2));
				}
				System.out.println("Total cost : " + totalTicketPrice);
			}
		}
		else {
			System.out.println("Minimum 5 and Maximum 40 tickets");
		}
	}
}
