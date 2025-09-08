package com.vc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer 
{
   private int id ;
   private String name;
   private float bill;
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getBill() {
	return bill;
}
public void setBill(float bill) {
	this.bill = bill;
}
   
}

