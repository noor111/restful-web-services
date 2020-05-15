package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public enum MsgEventType {
	
	FAILURE_EVENT("Failure Event"),
	PROCESSING_DONE_EVENT("Processing Done Event"),
	SITE_CONFIG_WORKFLOW_EVENT("Site Config Workflow Event"),
	CUSTOMER_WORKFLOW_EVENT("Customer Workflow Event");
	
	private String label;
	
	private MsgEventType(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

}
