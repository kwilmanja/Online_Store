public class Customer{

	private String name;
	private String email;
	private Orders order = new Orders();

	public Customer(String name, String email){
		this.name = name;
		this.email = email;
	}

	public void addItem(Item item){
		order.addItem(item);
	}

	public String viewOrder(){
		return this.name + "\t" + this.email + "\n" + order.summary();
	}



}