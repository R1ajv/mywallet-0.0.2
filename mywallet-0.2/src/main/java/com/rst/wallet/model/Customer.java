package com.rst.wallet.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.*;


@Document(collection = "Customer")
public class Customer {

    @Transient
    public static final String SEQUENCE_NAME = "customer_sequence";

    @Id
    long customerId;
    @NotBlank(message = "First name should not be empty")
    String firstName;
    @NotBlank(message = "Last name should not be empty")
    String lastName;
    @Email(message = "should be proper email address")
    String email;
    @JsonFormat(pattern = "dd-MM-yyyy")
    Date dob;
    @Digits(integer = 10, fraction = 0, message = "Phone number should be 10 digits")
    Long phoneNumber;
    
    @Pattern(regexp = "[a-zA-Z0-9]", message = "Post code should be alpha numeric")
    String postCode;
    
    @Pattern(regexp = "[a-zA-Z0-9]", message = "address should be alpha numeric")
    private String address;
    
    @Pattern(regexp = "[a-zA-Z0-9]")
    String password;

	public Customer() {
		super();
	}

	public Customer(@NotBlank(message = "First name should not be empty") String firstName,
			@NotBlank(message = "Last name should not be empty") String lastName,
			@Email(message = "should be proper email address") String email, Date dob,
			@Digits(integer = 10, fraction = 0, message = "Phone number should be 10 digits") Long phoneNumber,
			@Pattern(regexp = "[a-zA-Z0-9]", message = "Post code should be alpha numeric") String postCode,
			@Pattern(regexp = "[a-zA-Z0-9]", message = "address should be alpha numeric") String address,
			@Pattern(regexp = "[a-zA-Z0-9]") String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.postCode = postCode;
		this.address = address;
		this.password = password;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", postCode=" + postCode + ", address="
				+ address + ", password=" + password + "]";
	}

}
