package com.brian.models;

import java.util.List;
import java.util.Objects;




public class User {


	private int userId;


	private String userName;


	private String password;

	private String firstName;

	private String lastName;

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
