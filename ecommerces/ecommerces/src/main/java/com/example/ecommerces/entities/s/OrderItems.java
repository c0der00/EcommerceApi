package com.example.ecommerces.entities.s;

import java.io.Serializable;
import java.util.Objects;

import com.example.ecommerces.entities.Order;
import com.example.ecommerces.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
 
@Embeddable
public class OrderItems implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItems other = (OrderItems) obj;
		return Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}
	public Order getOrder() {
		return order;
	}
	public Product getProduct() {
		return product;
	}
	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}

}
