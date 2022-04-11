package com.rst.wallet.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.persistence.JoinColumn;


@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	
	@Column(nullable = false , name = "firstName" , length = 45)
	@NotNull
	private String firstName;
	
	@Column(nullable = false , name = "lastName" , length = 45)
	@NotNull
	private String lastName;
	
	@Column(nullable = false , name = "email" , length = 45)
	@NotNull
	private String email;
	
	@Column(nullable = false , name = "date" , length = 45)
	@NotNull
	private Date date ;
	
	@Column(nullable = false , name = "phoneNumber" , length = 10)
	@NotNull
	@Valid
	private long phoneNumber;
	
	@Column(nullable = false , name = "address" , length = 45)
	@NotNull
	private String postCode;

	@Column(name="AUTHORITY")
	@CollectionTable(name = "AUTHORITIES",joinColumns = {@JoinColumn(name="USERNAME")})
	private Set<String> authorities;
	
	public Customer() {
		
	}
	
	public Customer(long customerId, String firstName, String lastName, String email, Date date, long phoneNumber,
			String postCode) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.date = date;
		this.phoneNumber = phoneNumber;
		this.postCode = postCode;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	
	public Set<String> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<String> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", date=" + date + ", phoneNumber=" + phoneNumber + ", postCode=" + postCode + "]";
	}

}
