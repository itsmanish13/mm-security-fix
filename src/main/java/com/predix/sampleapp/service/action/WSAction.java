package com.predix.sampleapp.service.action;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class WSAction<R,S> implements ESAction<R,S> {

	@Autowired
	protected DispatcherAction dispatcher;
	
	@PostConstruct
	public void init(){
		
		dispatcher.registerAction(this.getClass(),this);
		
	}
	
}
