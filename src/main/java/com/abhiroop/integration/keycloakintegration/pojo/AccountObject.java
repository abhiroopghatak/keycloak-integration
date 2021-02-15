package com.abhiroop.integration.keycloakintegration.pojo;

public class AccountObject {

	
	private long accNumber;
	private String ownerName;
	private long amount;
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public AccountObject(long accNumber, String ownerName, long amount) {
		super();
		this.accNumber = accNumber;
		this.ownerName = ownerName;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "AccountObject [accNumber=" + accNumber + ", ownerName=" + ownerName + ", amount=" + amount + "]";
	}
}
