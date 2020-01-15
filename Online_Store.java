public class Online_Store{
	public static void main(String[] args){
		Customer john = new Customer("John", "john@yahoo.com");
		john.startOrder();
		Item jacket = new Item("Jacket", "F11", 500);
		john.addItem(jacket);
		Item shirt = new Item("Shirt", "F12", 900);
		john.addItem(shirt);
		Item pants = new Item("Pants", "F7", 700, 10);
		john.addItem(pants);
		System.out.println(john.viewOrder());
		john.endOrder();
		john.startOrder();
		Item gloves = new Item("Gloves", "F91", 500);
		john.addItem(gloves);
		Item socks = new Item("Socks", "F19", 800, 25);
		john.addItem(socks);
		Item hat = new Item("Hat", "F43", 700, 10);
		john.addItem(hat);
		System.out.println(john.viewOrder());
		john.endOrder();
	}
}