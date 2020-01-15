import java.util.*;

public class Customer{

	private String name;
	private String email;

	private ArrayList<Order> orders = new ArrayList<Order>();
	private int orderNumbers;

	private Order order;


	public Customer(String name, String email){
		this.name = name;
		this.email = email;
		this.orderNumbers = 0;
	}

	public void startOrder(){
		order = new Order();
	}

	public void endOrder(){
		orderNumbers += 1;
		orders.add(order);
	}

	public void addItem(Item item){
		order.addItem(item);
	}

	public String viewOrder(){
		return "Order " + orderNumbers + "\n" + this.name + "\t" + this.email + "\n" + order.summary();
	}



}