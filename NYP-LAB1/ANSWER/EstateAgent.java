package kutayalptekin;

public class EstateAgent {
    int i=0;
	private String name;
	private Home[] h;
	
	public EstateAgent() {
		super();
		h=new Home[10];
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 

	
	public void hasHome(Home home)
	{
		int i=0;
		while(h[i]!=null)
		{
			i++;
		}
		h[i]=home;
	}
	
	public void listHome()
	{
		int i=0;
		while(h[i]!=null) {
			System.out.println(i+1 + ". Location: " + h[i].getLocation() + " Price: " + h[i].getPrice()); 
			i++;
		}
	}
	
	public void sellHome(Home home,Customer customer)
	{
		customer.buyHome(home);
		int i=0;
		while(h[i]!=home) {
			i++;
		}
		for(;i<(h.length-1);i++) { 
			h[i]=h[i+1];
		}
		
	}
}
