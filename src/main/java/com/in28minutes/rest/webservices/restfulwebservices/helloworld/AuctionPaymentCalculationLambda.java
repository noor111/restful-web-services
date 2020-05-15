package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.List;
import java.util.function.Predicate;

public class AuctionPaymentCalculationLambda {
	
	public void inPersonPayment(List<AuctionCustomer> acList, Predicate<AuctionCustomer> pred) {
		for (AuctionCustomer ac: acList) {
			if (pred.test(ac)) {
				printInPersonInvoice(ac);
			}
		}
	}
	
	public void onlinePersonPayment(List<AuctionCustomer> acList, Predicate<AuctionCustomer> pred) {
		for (AuctionCustomer ac: acList) {
			if (pred.test(ac)) {
				printOnlinePersonInvoice(ac);
			}
		}
	}
	
	private void printInPersonInvoice(AuctionCustomer ac) {				
		double total = (ac.getLotTotal() == null) ? 0.0 : ac.getLotTotal().doubleValue() + ac.getLotTotal().doubleValue() * 0.20;
		System.out.println("In-Person Customer Invoice Total for " + ac.getGivenName() + " is: " + total);
	}
	
	private void printOnlinePersonInvoice(AuctionCustomer ac) {
		double total = (ac.getLotTotal() == null) ? 0.0 : ac.getLotTotal().doubleValue() + ac.getLotTotal().doubleValue() * 0.25;
		System.out.println("Online Customer Invoice Total for " + ac.getGivenName() + " is: " + total);
	}
		

}
