package com.predix.sampleapp.service.action.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.predix.sampleapp.model.PredixMessageRequest;
import com.predix.sampleapp.model.PredixMessageResponse;
import com.predix.sampleapp.service.PredixService;
import com.predix.sampleapp.service.action.WSAction;

@Component
public class MessageAction extends WSAction<PredixMessageRequest, PredixMessageResponse> {

	@Autowired
	PredixService predixService;

	
	@Override
	public PredixMessageResponse perform(PredixMessageRequest req) {
		// TODO Auto-generated method stub
		return predixService.getPredixMessage(req);
	}
	
	

}
