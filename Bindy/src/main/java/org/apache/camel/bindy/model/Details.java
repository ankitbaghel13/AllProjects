package org.apache.camel.bindy.model;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Details implements Processor{

	public void process(Exchange exchange) throws Exception {
		Order order = (Order) exchange.getIn().getBody();
		System.out.println(order.getFirstName());
		System.out.println(order.getLastName());
		System.out.println(order.getClientNr());
		System.out.println(order.getOrderNr());
		
		System.out.println("processing done");
	}
	
}
