package Activity4;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Product> cartProducts;
	private Double cartTotal;
	
	public Cart() {
		this.cartProducts = new ArrayList<Product>();
		this.cartTotal = 0.0;
	}
	
	public void addToCart(Product product) {
		this.cartProducts.add(product);
		this.cartTotal += product.price;
	}
	
	public void removeFirstItem(Product product) {
		for (Product p : this.cartProducts) {
			if (p == product) {
				this.cartProducts.remove(product);
				break;
			}
		}
	}
	
	public void listProducts() {
		String cartItems = "";
		
		for(Product p : this.cartProducts) {
			cartItems += p.name + "\n";
		}
		System.out.println(cartItems);
	}
	
	public void placeOrder(Client client) {
		if (client.balance >= cartTotal){
		this.cartProducts.clear();
		this.cartTotal = 0.0;
		System.out.println("your items will be delivered soon enough");
		}
	}
}
