package com.blumoc.backendfcolnoz.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.blumoc.backendfcolnoz.service.AutoEvaluacionService;


@Service("autoevaluacionService")
public class AutoEvaluacionServiceImpl implements AutoEvaluacionService {

	public static final Log LOG = LogFactory.getLog(AutoEvaluacionServiceImpl.class);

	@Override
	public void getMessageService() {
		LOG.info("AutoevaluacionService message");
	}
	

}
