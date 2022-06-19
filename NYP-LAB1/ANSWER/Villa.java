package kutayalptekin;

public class Villa extends Home {
	
	public Villa(double price,String location) {
		super(price,location);
	}
	
	@Override
	double discountedPrice() {
		return (this.getPrice()*0.90);
	}

	
}
