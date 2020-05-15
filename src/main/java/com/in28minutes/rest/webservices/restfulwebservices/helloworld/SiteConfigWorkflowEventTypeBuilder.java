package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.ArrayList;
import java.util.List;

public class SiteConfigWorkflowEventTypeBuilder extends WorkflowEventTypeBuilder {
		
	public SiteConfigWorkflowEventTypeBuilder() {
		this.type = MsgEventType.SITE_CONFIG_WORKFLOW_EVENT;
	}
	
	public SiteConfigWorkflowEventTypeBuilder(String msgId, MsgEventCategory category, WorkflowTask task, List<String> details) {
		this.msgId = msgId;
		this.category = category;
		this.type = MsgEventType.SITE_CONFIG_WORKFLOW_EVENT;
		this.transformedTask = task.transformTask();
		this.details = details;		
	}
	
	public void type() {
		this.type = MsgEventType.SITE_CONFIG_WORKFLOW_EVENT;
	}
	
	public MsgEventType getType() {
		return MsgEventType.SITE_CONFIG_WORKFLOW_EVENT;
	}
	
	public MsgEvent build() {
		return new MsgEvent(this);
	}
	
	public String toString() {
		return String.format("SiteConfigWorkflowEventTypeBuilder:  Category: %s  Type: %s  Task: %s  Detail: %s", category, type, transformedTask, details.get(0));
	}

}
