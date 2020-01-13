import java.util.Scanner;

public class Online_Store{
	public static void main(String[] args){
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Welcome to the online store!");
//
//		System.out.println("What is your name?");
//		String name = scan.nextLine();
//		System.out.println("What is your email?");
//		String email = scan.nextLine();
//		Customer name = new Customer(name, email);
		Customer john = new Customer("John", "john@yahoo.com");
		Item jacket = new Item("Jacket", "F11", 500);
		john.addsItem(jacket);
		Item shirt = new Item("Shirt", "F12", 900);
		john.addsItem(shirt);
		Item pants = new Item("Pants", "F7", 700);
		john.addsItem(pants);
		System.out.println(john.viewOrder());
		
		

	}
}