package com.brian.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@JsonIgnoreProperties(ignoreUnknown = true)
public class Reservation {
	
	private int id;
	
	private int quantity;
	
	private float totalCost;

	public Reservation(int id, int quantity, float totalCost) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.totalCost = totalCost;
	}

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, quantity, totalCost);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		return id == other.id && quantity == other.quantity
				&& Float.floatToIntBits(totalCost) == Float.floatToIntBits(other.totalCost);
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", quantity=" + quantity + ", totalCost=" + totalCost + ", getId()=" + getId()
				+ ", getQuantity()=" + getQuantity() + ", getTotalCost()=" + getTotalCost() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	


	
}
