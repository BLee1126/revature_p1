package com.brian.models;

import java.util.Objects;



public class Jet {

	private int id;

	private String name;

	private int capacity;

	public Jet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jet(int id, String name, int capacity) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacity, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return capacity == other.capacity && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Jet [id=" + id + ", name=" + name + ", capacity=" + capacity + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getCapacity()=" + getCapacity() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	

	
	
}
