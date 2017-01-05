package com.predix.sampleapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.predix.sampleapp.model.PredixMessageRequest;
import com.predix.sampleapp.model.PredixMessageResponse;
import com.predix.sampleapp.model.PredixSampleRequest;
import com.predix.sampleapp.model.PredixSampleResponse;
import com.predix.sampleapp.service.action.DispatcherAction;
import com.predix.sampleapp.service.action.message.MessageAction;
import com.predix.sampleapp.service.action.message.MessageParamAction;


@RestController
@RequestMapping(value="/predix", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class PredixController {
	
	@Autowired
	DispatcherAction dispatcherAction;

	@RequestMapping(value = "/sampleData", method = RequestMethod.POST)
	public PredixMessageResponse getSampleData(@RequestBody PredixMessageRequest req) {
		return dispatcherAction.dispatchAction(MessageAction.class, req);
	}
	
	@RequestMapping(value = "/sampleDataParam", method = RequestMethod.POST)
	public PredixSampleResponse getSampleDataWithParam(@RequestBody PredixSampleRequest req) {
		System.out.println(req.getNum() + req.getXxx() + req.getYyy());
		return dispatcherAction.dispatchAction(MessageParamAction.class, req);
	}
}
