package com.predix.sampleapp.service.action;
@FunctionalInterface
public interface ESAction<R,S> {
	
	S perform(R req) ;

}
