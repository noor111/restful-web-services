package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerWorkflowEventTypeBuilder extends WorkflowEventTypeBuilder {
		
	public CustomerWorkflowEventTypeBuilder() {
		this.type = MsgEventType.CUSTOMER_WORKFLOW_EVENT;
	}
	
	public CustomerWorkflowEventTypeBuilder(String msgId, MsgEventCategory category, WorkflowTask task, List<String> details) {
		this.msgId = msgId;
		this.category = category;
		this.type = MsgEventType.CUSTOMER_WORKFLOW_EVENT;
		this.transformedTask = task.transformTask();
		this.details = details;		
	}
			
	public void type() {
		this.type = MsgEventType.CUSTOMER_WORKFLOW_EVENT;
	}
	
	public MsgEventType getType() {
		return MsgEventType.CUSTOMER_WORKFLOW_EVENT;
	}
			
	public MsgEvent build() {
		return new MsgEvent(this);
	}
		
	public String toString() {
		return String.format("CustomerWorkflowEventTypeBuilder:  Category: %s  Type: %s  Task: %s  Detail: %s", category, type, transformedTask, details.get(0));
	}

}
