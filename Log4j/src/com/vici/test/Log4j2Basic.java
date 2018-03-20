package com.vici.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Basic {
	private static final Logger logger = LogManager.getLogger(Log4j2Basic.class.getName());

	public static void main(String[] args) {
		Log4j2Basic log4j2Test = new Log4j2Basic();
		log4j2Test.hello();
	}

	public void hello() {
			logger.trace("trace!");
			logger.info("info!");
			logger.error("error!");
			logger.fatal("fatal!");
	}

	public void hello2() {
		int i = 0;
		while (i++ < 100) {
			logger.trace("trace!");
			logger.info("info!");
			logger.error("error!");
			logger.fatal("fatal!");
		}
	}
}
