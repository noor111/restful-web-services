package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class AuctionCustomer {
	
	private String givenName;
	private String surName;
	private String eMail;
	private String phone;
	private String address;
	private String auctionCustomerType;
	private Number lotTotal;
	private Number invoiceTotal;	
	
	public AuctionCustomer(String givenName, String surName, String eMail, String phone, String address,
			String auctionCustomerType, Number lotTotal, Number invoiceTotal) {
		super();
		this.givenName = givenName;
		this.surName = surName;
		this.eMail = eMail;
		this.phone = phone;
		this.address = address;
		this.auctionCustomerType = auctionCustomerType;
		this.lotTotal = lotTotal;
		this.invoiceTotal = invoiceTotal;
	}
	
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	public String getAuctionCustomerType() {
		return auctionCustomerType;
	}
	public void setAuctionCustomerType(String auctionCustomerType) {
		this.auctionCustomerType = auctionCustomerType;
	}
	public Number getLotTotal() {
		return lotTotal;
	}
	public void setLotTotal(Number lotTotal) {
		this.lotTotal = lotTotal;
	}	
	public Number getInvoiceTotal() {
		return invoiceTotal;
	}
	public void setInvoiceTotal(Number invoiceTotal) {
		this.invoiceTotal = invoiceTotal;
	}
	
	@Override
	public String toString() {
		return "AuctionCustomer [givenName=" + givenName + ", surName=" + surName + ", eMail=" + eMail + ", phone="
				+ phone + ", address=" + address + ", lotTotal=" + lotTotal + "]";
	}
	

}
