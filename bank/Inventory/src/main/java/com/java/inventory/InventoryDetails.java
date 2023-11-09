package com.java.inventory;

public class InventoryDetails {
	

	private String stockId;
	private String itemName;
	private double price;
	private int quantityAvail;
	
	
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	public InventoryDetails(String stockId, String itemName, double price, int quantityAvail) {
		super();
		this.stockId = stockId;
		this.itemName = itemName;
		this.price = price;
		this.quantityAvail = quantityAvail;
	}
	public InventoryDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "InventoryDetails [stockId=" + stockId + ", itemName=" + itemName + ", price=" + price
				+ ", quantityAvail=" + quantityAvail + "]";
	}
	
}