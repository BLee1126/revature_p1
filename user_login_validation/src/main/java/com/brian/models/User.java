package com.brian.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="users", schema="p1_users")
public class User {
	// account number in SQL DB
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "user_id_seq")
	@SequenceGenerator(name = "user_id_seq", allocationSize = 1)
	private int userId;
	// username registered for customerNumber
	@Column(name="username", unique = true, nullable = false)
	private String userName;
	// password hashed. registered for customerNumber
	@Column(name="password", nullable = false)
	private String password;
	// personal information for customer
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private int membershipLevel;
	
	
//	private List<Reservation> rsvps;
	public User() {
		super();
	}
	public User(int userId, String userName, String password, String firstName, String lastName, int membershipLevel,
			List<Reservation> rsvps) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.membershipLevel = membershipLevel;
//		this.rsvps = rsvps;
	}
	
	
	public User(int userId, String userName, String password, String firstName, String lastName, int membershipLevel) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.membershipLevel = membershipLevel;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getMembershipLevel() {
		return membershipLevel;
	}
	public void setMembershipLevel(int membershipLevel) {
		this.membershipLevel = membershipLevel;
	}
//	public List<Reservation> getRsvps() {
//		return rsvps;
//	}
//	public void setRsvps(List<Reservation> rsvps) {
//		this.rsvps = rsvps;
//	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, membershipLevel, password, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& membershipLevel == other.membershipLevel && Objects.equals(password, other.password)
//				&& Objects.equals(rsvps, other.rsvps) && userId == other.userId
				&& Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", membershipLevel=" + membershipLevel + "]";
	}
	public User(String userName, String password, String firstName, String lastName, int membershipLevel) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.membershipLevel = membershipLevel;
	}
	
	
}
