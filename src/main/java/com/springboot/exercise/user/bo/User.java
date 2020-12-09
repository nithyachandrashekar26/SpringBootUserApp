package com.springboot.exercise.user.bo;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {

	private @Id @GeneratedValue Long empid;
	private String title;
	private String firstName;
	private String lastName;
	private String gender;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "address.id")
	private Address address;

	User() {
	}

	public User(String title, String fName, String lName, String gender, Address address) {
		this.title = title;
		this.firstName = fName;
		this.lastName = lName;
		this.gender = gender;
		this.address = address;
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((empid == null) ? 0 : empid.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;

		User user = (User) obj;
		return Objects.equals(this.empid, user.empid) && Objects.equals(this.firstName, user.firstName)
				&& Objects.equals(this.lastName, user.lastName) && Objects.equals(this.gender, user.gender)
				&& Objects.equals(this.title, user.title) && Objects.equals(this.address, user.address);
	}

	@Override
	public String toString() {
		return "User [empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + ", title=" + title
				+ ", gender=" + gender + ", address=" + address + "]";
	}

}