package com.brian.dto;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.brian.models.ReservationKey;

@Entity
public class Reservation {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "reservation_id_seq")
	@SequenceGenerator(name = "reservation_id_seq", allocationSize = 1)
	private int id;
	@Column
	private int quantity;
	@Column
	private float totalCost;
	
	
	public Reservation() {
		super();
		
	}
	public Reservation(int id, int quantity, float totalCost) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.totalCost = totalCost;
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
		return Objects.hash(quantity, totalCost);
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
		return quantity == other.quantity && Float.floatToIntBits(totalCost) == Float.floatToIntBits(other.totalCost);
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", quantity=" + quantity + ", totalCost=" + totalCost + "]";
	}

	
}
