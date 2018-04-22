package org.apache.camel.bindy.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",")
public class Order {
 
    @DataField(pos = 1)
    private int orderNr;
 
    @DataField(pos = 2, required = true)
    private String clientNr;
 
    @DataField(pos = 3, required = true)
    private String firstName;
 
    @DataField(pos = 4, required = true)
    private String lastName;

	public int getOrderNr() {
		return orderNr;
	}

	public void setOrderNr(int orderNr) {
		this.orderNr = orderNr;
	}

	public String getClientNr() {
		return clientNr;
	}

	public void setClientNr(String clientNr) {
		this.clientNr = clientNr;
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

}