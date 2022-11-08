package com.aftab.ANTally;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class transac {
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trno;
	
private String transtype;
private String to;
private String BY;
private double debit;
private double credit;
private double currentbal;
public transac() {
	super();
	// TODO Auto-generated constructor stub
}
public transac(String trans_type, String tO, String bY, double debit, double credit, double currentbal) {
	super();

	transtype = trans_type;
	to = tO;
	BY = bY;
	this.debit = debit;
	this.credit = credit;
	this.currentbal = currentbal;
}
public int getTrno() {
	return trno;
}
public void setTrno(int trno) {
	this.trno = trno;
}
public String getTrans_type() {
	return transtype;
}
public void setTrans_type(String trans_type) {
	transtype = trans_type;
}
public String getTO() {
	return to;
}
public void setTO(String tO) {
	to = tO;
}
public String getBY() {
	return BY;
}
public void setBY(String bY) {
	BY = bY;
}
public double getDebit() {
	return debit;
}
public void setDebit(double debit) {
	this.debit = debit;
}
public double getCredit() {
	return credit;
}
public void setCredit(double credit) {
	this.credit = credit;
}
public double getCurrentbal() {
	return currentbal;
}
public void setCurrentbal(double currentbal) {
	this.currentbal = currentbal;
}

}
