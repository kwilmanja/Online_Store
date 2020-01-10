public class Customer{

	private String name;
	private String email;
	private Order order;

	public Customer(name, email){
		this.name = name;
		this.email = email;
	}

	public void addItem(item){
		order.addItem(item);
	}

	public String viewOrder(){
		
		cost = order.calculateCost();

	}

}