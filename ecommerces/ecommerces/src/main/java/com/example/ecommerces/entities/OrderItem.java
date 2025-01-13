package com.example.ecommerces.entities;

import java.io.Serializable;
import java.util.Objects;

import com.example.ecommerces.entities.s.OrderItems;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItems id = new OrderItems();
	
	private Integer quantity;
	private Double price;
	
	public OrderItem() {
	}

	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public Double getPrice() {
		return price;
	}
	
	public Product getProduct() {
		return id.getProduct();
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getSubTotal() {
		return price * quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public void setOrder(Order order){
		id.setOrder(order);
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void setProduct(Product product){
		id.setProduct(product);
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
