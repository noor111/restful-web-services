package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public enum WorkflowTask implements TaskTransformerInterface {
	
	UPDATE {
		@Override
		public MsgEventTask transformTask() {
			return MsgEventTask.UPDATE;
		}
	},
	APPROVE {
		@Override
		public MsgEventTask transformTask() {
			return MsgEventTask.APPROVE;
		}
	},
	DELETE {
		@Override
		public MsgEventTask transformTask() {
			return MsgEventTask.DELETE;
		}
	};
}
