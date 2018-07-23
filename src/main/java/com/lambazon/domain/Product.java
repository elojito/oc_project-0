package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;
	private double InventoryPrice; //created for getInventoryPrice()

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		//set 0 as quantity if set quantity is negative
		if(quantity < 0) {
			quantity = 0;
		}
		else {
			this.quantity = quantity;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		// controls added for negative prices or prices superior to 1000
		if(price < 0)price = 0;
		if (price > 1000)price = 1000;
		this.price = price;
	}

	public double getInventoryPrice() {
		// TODO Auto-generated method stub
		//price*quantity for total price of this product inventory
		double price = getPrice();
		int quantity = getQuantity();
		double qu = (double)quantity;
		InventoryPrice = price*qu;
		return InventoryPrice;
	}
}
