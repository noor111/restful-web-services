package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class WorkflowEventTypeBuilder {
	
	protected String msgId;
	protected MsgEventCategory category;
	protected MsgEventType type;
	protected List<String> details;
	protected WorkflowTask task;
	protected MsgEventTask transformedTask;
	
	public void msgId(String msgId) {
		this.msgId = msgId;
	}
	
	public String getMsgId() {
		return msgId;
	}
	
	public void category(MsgEventCategory category) {
		this.category = category;
	}
	
	public MsgEventCategory getCategory() {
		return category;
	}
	
	public void details(List<String> details) {
		this.details = details;
	}
	
	public List<String> getDetails() {
		return details;
	}
	
	public void addDetail(String detail) {
		if (details == null) {
			details = new ArrayList<>();
			details.add(detail);
		}
	}
	
	public WorkflowEventTypeBuilder task(WorkflowTask task) {
		this.transformedTask = task.transformTask();
		return this;
	}
	
	public WorkflowTask getTasks() {		
		return task;
	}
	
	public MsgEventTask getTask() {		
		return transformedTask;
	}
	
	public Map getAttributeMap(Message message) {
		return transformedTask.buildAttributeMap(message);
	}

}
