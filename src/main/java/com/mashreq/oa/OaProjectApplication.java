package com.mashreq.oa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mashreq.oa.controller.PaymentDataController;

@SpringBootApplication
public class OaProjectApplication {
	private static final Logger logger = LoggerFactory.getLogger(OaProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OaProjectApplication.class, args);
		logger.info("OA_Project has been Stated Successfully..");
	}

}
