package com.brian.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Jet {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "jet_id_seq")
	@SequenceGenerator(name = "jet_id_seq", allocationSize = 1)
	private int id;
	@Column
	private String name;
	@Column
	private int capacity;
	
	public Jet(int id, String name, int capacity) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
	}

	public Jet() {
		// TODO Auto-generated constructor stub
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
