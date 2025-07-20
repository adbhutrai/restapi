package com.example.demo;

import lombok.ToString;
@ToString
public class StudentDTO {
	private String emailAddress;
	private String name;
	private String purchasedPackage;

	public StudentDTO() {
	}

	public StudentDTO(String emailAddress, String name, String purchasedPackage) {
		this.emailAddress = emailAddress;
		this.name = name;
		this.purchasedPackage = purchasedPackage;

	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getName() {
		return name;
	}

	public String getPurchasedPackage() {
		return purchasedPackage;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPurchasedPackage(String purchasedPackage) {
		this.purchasedPackage = purchasedPackage;
	}

}
