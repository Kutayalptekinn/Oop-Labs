package kutayalptekin;

public class Apartment extends Home{
	
	private double dues;
	
	public Apartment(double price,String location,double dues) {
		
		super(price,location);
		this.dues=dues;
	}
	

	public double getDues() {
		return dues;
	}

	public void setDues(double dues) {
		this.dues = dues;
	}
	
	@Override
	double discountedPrice() {
		return (this.getPrice()*0.95) ;
	}
	
	
}
