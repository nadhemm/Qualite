package tn.insat.domain;

public class Produit {
	private String id;
	private double price;
	
	public Produit(String id, double price) {
		super();
		this.id = id;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		int a;
		this.price = price;
	}
	
	

}
