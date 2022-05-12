package com.brian.models;

import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import com.brian.dto.Reservation;

public class Route {
	@Id
	private int id;
	@Column
	private String fromWhere;
	@Column
	private String toWhere;
	@Column
	private float cost;
	@Column
	private LocalTime date;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(joinColumns = {@JoinColumn(name = "jet_id")},
	inverseJoinColumns = {@JoinColumn(name = "route_id")})
	private List<Reservation> reservations;
	
	

	
	public Route(int id, String fromWhere, String toWhere, float cost, LocalTime date) {
		super();
		this.id = id;
		this.fromWhere = fromWhere;
		this.toWhere = toWhere;
		this.cost = cost;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFromWhere() {
		return fromWhere;
	}
	public void setFromWhere(String fromWhere) {
		this.fromWhere = fromWhere;
	}
	public String getToWhere() {
		return toWhere;
	}
	public void setToWhere(String toWhere) {
		this.toWhere = toWhere;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public LocalTime getDate() {
		return date;
	}
	public void setDate(LocalTime date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, date, fromWhere, id, toWhere);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Route other = (Route) obj;
		return Float.floatToIntBits(cost) == Float.floatToIntBits(other.cost) && Objects.equals(date, other.date)
				&& Objects.equals(fromWhere, other.fromWhere) && id == other.id
				&& Objects.equals(toWhere, other.toWhere);
	}
	@Override
	public String toString() {
		return "Route [id=" + id + ", fromWhere=" + fromWhere + ", toWhere=" + toWhere + ", cost=" + cost + ", date="
				+ date + ", getId()=" + getId() + ", getFromWhere()=" + getFromWhere() + ", getToWhere()="
				+ getToWhere() + ", getCost()=" + getCost() + ", getDate()=" + getDate() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
}
