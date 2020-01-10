import java.util.Scanner;

public class Online_Store{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the online store!");

		System.out.println("What is your name?");
		String name = scan.nextLine();
		System.out.println("What is your email?");
		String email = scan.nextLine();
		Customer name = new Customer(name, email);
		
		

	}
}