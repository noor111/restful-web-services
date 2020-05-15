package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MsgEvent {
	
	private String msgId;
	private MsgEventCategory msgEventCategory;
	private MsgEventType msgEventType;
	private MsgEventTask msgEventTask;
	private List<String> details;
	
	public MsgEvent(CustomerWorkflowEventTypeBuilder builder) {
		msgId = builder.getMsgId();
		msgEventType = builder.getType();
		msgEventCategory = builder.getCategory();
		msgEventTask = builder.getTask();		
		details = builder.getDetails();
	}
	
	public MsgEvent(SiteConfigWorkflowEventTypeBuilder builder) {
		msgId = builder.getMsgId();
		msgEventType = builder.getType();
		msgEventCategory = builder.getCategory();
		msgEventTask = builder.getTask();
		details = builder.getDetails();
	}
	
	public MsgEventType getMsgEventType() {
		return msgEventType;
	}
	public void setMsgEventType(MsgEventType msgEventType) {
		this.msgEventType = msgEventType;
	}
	public MsgEventCategory getMsgEventCategory() {
		return msgEventCategory;
	}
	public void setMsgEventCategory(MsgEventCategory msgEventCategory) {
		this.msgEventCategory = msgEventCategory;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	
	public void add(String detail) {
		details.add(detail);
	}
	
	public void addAll(List<String> details) {
		if (details.isEmpty()) {
			details = new ArrayList<String>();
		}
		this.details.addAll(details);
	}
	
	public Map getAttributeMap(Message message) {
		return msgEventTask.buildAttributeMap(message);
	}
	
	public String toString() {
		return String.format("MsgEvent:  Category: %s  Type: %s  Task: %s  Detail: %s", msgEventCategory, msgEventType, msgEventTask, details.get(0));
	}
}
