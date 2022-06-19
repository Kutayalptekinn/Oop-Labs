package kutayalptekin;

import java.util.HashMap;

public class Customer  {
	
	private String name;
	private String telephone;
	private String address;
	private Home[] hm;
	private int homeCounter;
	private double payment;
	
	public Customer(String name,String telephone,String address) {
		super();
		this.name=name;
		this.telephone=telephone;
		this.address=address;
		homeCounter=0;
		payment=0;
		hm = new Home[10];
		
	}
	
	public void buyHome(Home home)
	{
		hm[homeCounter]=home;
		homeCounter++;
		if(homeCounter>2)
			payment+=home.discountedPrice();
		else
		    payment=payment+home.getPrice();
	}
	
	public void listHome()
	{
		int i=0;
		while(hm[i]!=null) {
			System.out.println(i+1 + "Location: " + hm[i].getLocation() + " Price: " + hm[i].getPrice()); 
			i++;
		}
	}
	
	public String getInfo()
	{
		String info;
		info= "Name: " + this.getName() + "Number of Home: " + this.homeCounter + " Total Money Paid: " + this.payment;
		return info;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public int getHomeCounter() {
		return homeCounter;
	}
	public void setHomeCounter(int homeCounter) {
		this.homeCounter = homeCounter;
	}
	
	public void listLocations() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<10;i++)
		{
			if(hm[i]!=null)
			{
				map.putIfAbsent(hm[i].getLocation(), 0);
				map.put(hm[i].getLocation(), map.get(hm[i].getLocation())+1);
			}
		}
			for(String myMap : map.keySet()) {
				System.out.println("city" + myMap +" ->" + map.get(myMap) + " home");
			}
			
		
	}

}
