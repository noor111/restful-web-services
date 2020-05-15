package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.HashMap;
import java.util.Map;

public enum MsgEventTask implements AttributeMapInterface {
	
	UPDATE("Update") {
		@Override
		public Map buildAttributeMap(Message message) {
			Map attributeMap = new HashMap<String, Object>();
			attributeMap.put("psn", Integer.valueOf(message.getPsn()));
			attributeMap.put("osri", message.getOsri());
			attributeMap.put("ssn", message.getSsn());
			return attributeMap;
		}
	},
	APPROVE("Approve") {
		@Override
		public Map buildAttributeMap(Message message) {
			Map attributeMap = new HashMap<String, Object>();
			attributeMap.put("psn", Integer.valueOf(message.getPsn()));
			attributeMap.put("osri", message.getOsri());
			attributeMap.put("ssn", message.getSsn());
			return attributeMap;
		}
	},
	DELETE("Delete") {
		@Override
		public Map buildAttributeMap(Message message) {
			Map attributeMap = new HashMap<String, Object>();
			attributeMap.put("psn", Integer.valueOf(message.getPsn()));
			attributeMap.put("osri", message.getOsri());
			attributeMap.put("ssn", message.getSsn());
			return attributeMap;
		}
	};
	
	private String label;
	
	private MsgEventTask(String label) {
		this.label = label;
	}
}
