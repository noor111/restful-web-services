package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.AuctionCustomer;
import com.in28minutes.rest.webservices.restfulwebservices.helloworld.AuctionPaymentCalculationLambda;

public class AuctionPaymentCalculationLambdaTests {
	
	@Test
	public void auctionPaymentCalculationLambdaTests() {
		
		List<AuctionCustomer> allCustomersList = createTestList();
		
		AuctionPaymentCalculationLambda apcLambda = new AuctionPaymentCalculationLambda();
		
		Predicate<AuctionCustomer> predicateInPersonCustomers = customers -> customers.getAuctionCustomerType().equals("P");		
		Predicate<AuctionCustomer> predicateOnlineCustomers = customers -> customers.getAuctionCustomerType().equals("O");
		
		apcLambda.inPersonPayment(allCustomersList, predicateInPersonCustomers);
		apcLambda.onlinePersonPayment(allCustomersList, predicateOnlineCustomers);
		
	}	
	
	private List<AuctionCustomer> createTestList() {
		
		List<AuctionCustomer> acList = new ArrayList<>();
		
		AuctionCustomer cust = new AuctionCustomer("Jingle", "Bells", "jb123@hotmail.com", "567-4859", "321 Baboon Blvd", "P", 1540.50, null);
		acList.add(cust);
		cust = new AuctionCustomer("Timbuck", "Too", "tt123@hotmail.com", "567-4859", "999 Knuckles Lane", "O", 1540.50, null);
		acList.add(cust);
		cust = new AuctionCustomer("Tom", "Phooey", "tb123@hotmail.com", "567-4859", "555 Forest Hills Drive", "P", 1540.50, null);
		acList.add(cust);
		
		return acList;
		
	}

}
