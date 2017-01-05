package com.predix.sampleapp.service.action.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.predix.sampleapp.model.PredixSampleRequest;
import com.predix.sampleapp.model.PredixSampleResponse;
import com.predix.sampleapp.service.PredixService;
import com.predix.sampleapp.service.action.WSAction;

@Component
public class MessageParamAction extends WSAction<PredixSampleRequest, PredixSampleResponse> {

	@Autowired
	PredixService predixService;
	
	@Override
	public PredixSampleResponse perform(PredixSampleRequest req) {
		// TODO Auto-generated method stub
		System.out.println(req.getNum() + req.getXxx() + req.getYyy());
		return predixService.getPredixMessageWithParam(req);
	}

}
