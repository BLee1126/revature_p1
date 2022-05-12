package com.brian.models;

import java.util.Objects;

public class Reservation {
	private long id;
	private int quantity;
	private float totalCost;
	private long jet_id;
	private long route_id;
	private long user_id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public long getJet_id() {
		return jet_id;
	}
	public void setJet_id(long jet_id) {
		this.jet_id = jet_id;
	}
	public long getRoute_id() {
		return route_id;
	}
	public void setRoute_id(long route_id) {
		this.route_id = route_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, jet_id, quantity, route_id, totalCost, user_id);
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
		return id == other.id && jet_id == other.jet_id && quantity == other.quantity && route_id == other.route_id
				&& Float.floatToIntBits(totalCost) == Float.floatToIntBits(other.totalCost) && user_id == other.user_id;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", quantity=" + quantity + ", totalCost=" + totalCost + ", jet_id=" + jet_id
				+ ", route_id=" + route_id + ", user_id=" + user_id + "]";
	}
	
	
}


