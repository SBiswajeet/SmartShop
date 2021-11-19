package com.lti.assesment.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name = "productId", nullable = false)
	public int productId;
	@Column (name = "Name", nullable = false)
	public String name;
	@Column (name = "Category", nullable = false)
	public String category;
	@Column (name = "Quantity", nullable = false)
	public int quantity;
	@Column (name = "UnitPrice", nullable = false)
	public long unitPrice;
	@Column (name = "TotalPrice", nullable = false)
	public long totalPrice;
	@Column (name = "Rating", nullable = false)
	public int rating;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(long unitPrice) {
		this.unitPrice = unitPrice;
	}
	public long getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
