package com.aftab.ANTally;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounts {

private String invoice;
@Id
private String name;
private double balance=0;


private double totaldebit;
private double totalcredit;

public Accounts() {
	super();
	// TODO Auto-generated constructor stub
}
public Accounts(String invoice, String name, double balance, double totaldebit, double totalcredit) {
	super();
	this.invoice = invoice;
	this.name = name;
	this.balance = balance;
	this.totaldebit = totaldebit;
	this.totalcredit = totalcredit;
}
public double getTotaldebit() {
	return totaldebit;
}
public void setTotaldebit(double totaldebit) {
	this.totaldebit = totaldebit;
}
public double getTotalcredit() {
	return totalcredit;
}
public void setTotalcredit(double totalcredit) {
	this.totalcredit = totalcredit;
}
public String getInvoice() {
	return invoice;
}
public void setInvoice(String invoice) {
	this.invoice = invoice;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
}
