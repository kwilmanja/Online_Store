public class Online_Store{
	public static void main(String[] args){
		Customer john = new Customer("John", "john@yahoo.com");
		Item jacket = new Item("Jacket", "F11", 500);
		john.addItem(jacket);
		Item shirt = new Item("Shirt", "F12", 900);
		john.addItem(shirt);
		Item pants = new Item("Pants", "F7", 700, 10);
		john.addItem(pants);
		System.out.println(john.viewOrder());
	}
}