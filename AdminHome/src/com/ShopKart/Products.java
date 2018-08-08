package com.ShopKart;
public class Products {

	String productid;
	String productname;
	String category;
	int price;
	int quantity;
	int discountperc;
	String taxname;
	
	public Products() {
	}

	public Products(String productid, String productname, String category, int price, int quantity, int discountperc,
			String taxname) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.discountperc = discountperc;
		this.taxname = taxname;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDiscountperc() {
		return discountperc;
	}

	public void setDiscountperc(int discountperc) {
		this.discountperc = discountperc;
	}

	public String getTaxname() {
		return taxname;
	}

	public void setTaxname(String taxname) {
		this.taxname = taxname;
	}
	
}
