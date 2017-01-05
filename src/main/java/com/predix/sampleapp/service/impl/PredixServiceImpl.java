package com.predix.sampleapp.service.impl;

import org.springframework.stereotype.Service;

import com.predix.sampleapp.model.Message;
import com.predix.sampleapp.model.PredixMessageRequest;
import com.predix.sampleapp.model.PredixMessageResponse;
import com.predix.sampleapp.model.PredixSampleRequest;
import com.predix.sampleapp.model.PredixSampleResponse;
import com.predix.sampleapp.service.PredixService;

@Service
public class PredixServiceImpl implements PredixService {

	@Override
	public PredixMessageResponse getPredixMessage(PredixMessageRequest req) {
		// TODO Auto-generated method stub
		PredixMessageResponse predixMessageResponse = new PredixMessageResponse();
		Message message = new Message();
		message.setContent("I am your fan!!!");
		message.setMessageId(123L);
		message.setMessageType("Mail");
		message.setReceiver("Shahrukh Khan");
		message.setSender("Salman Khan");
		predixMessageResponse.setStatus("SUCCESS");
		predixMessageResponse.setMsg(message);
		return predixMessageResponse;
	}

	@Override
	public PredixSampleResponse getPredixMessageWithParam(PredixSampleRequest req) {
		// TODO Auto-generated method stub
		PredixSampleResponse predixSampleResponse = new PredixSampleResponse();
		System.out.println(req.getNum() + req.getXxx() + req.getYyy());
		predixSampleResponse.setNum(req.getNum());
		predixSampleResponse.setXxx(req.getXxx());
		predixSampleResponse.setYyy(req.getYyy());
		predixSampleResponse.setStatus("SUCCESS");
		return predixSampleResponse;
	}

}
