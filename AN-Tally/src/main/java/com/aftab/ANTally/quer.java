package com.aftab.ANTally;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class quer {
	
@Id
private int id=0;
private String quer;
private String color;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuer() {
	return quer;
}
public void setQuer(String quer) {
	this.quer = quer;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
}
