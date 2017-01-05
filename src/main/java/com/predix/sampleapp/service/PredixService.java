package com.predix.sampleapp.service;

import com.predix.sampleapp.model.PredixMessageRequest;
import com.predix.sampleapp.model.PredixMessageResponse;
import com.predix.sampleapp.model.PredixSampleRequest;
import com.predix.sampleapp.model.PredixSampleResponse;

public interface PredixService {
	PredixMessageResponse getPredixMessage(PredixMessageRequest req);
	
	PredixSampleResponse getPredixMessageWithParam(PredixSampleRequest req);

}
