package com.acme.order.util;

import java.security.SecureRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util {

	private static final Logger LOGGER = LoggerFactory.getLogger(Util.class);

	private static final SecureRandom RANDOM = new SecureRandom();
	
	public static void sleepForAWhile() {
		
		try {
			Thread.sleep(500 + RANDOM.nextInt(1500));
		} catch (InterruptedException e) {
			LOGGER.error("Someone woke-up me", e);
		}
	}
	
}
