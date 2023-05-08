package Houseing;

public class CheckPolymorphism {
	public static void main(String[] args) {
		HouseArchitecture houseArchitecture;
		
		houseArchitecture = new Villa();
		System.out.println("Average price of a villa is : " + String.format("%.0f", houseArchitecture.getPrice()));
		System.out.println("Banks who can provide loan are : " + houseArchitecture.getLoanBank());
		
		houseArchitecture = new Aparments();
		System.out.println("Average price of a villa is : " + String.format("%.0f", houseArchitecture.getPrice()));
		System.out.println("Banks who can provide loan are : " + houseArchitecture.getLoanBank());
	}
}
