package kutayalptekin;

public abstract class Home {
	private double price;
	private String location;



	public Home(double price, String location) {
		super();
		this.price=price;
		this.location=location;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	abstract double discountedPrice();


}
