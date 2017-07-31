package com.epam.training;

import java.util.Random;

import org.apache.log4j.Logger;

public class Runner {
	private static final int RANGE_ENUM_VALUES = 5;
	private static final int RANGE_TO_COUNT_RECORD = 100;
	private static final int MIN_COUNT_RECORD = 5;
	private static final Logger LOG = Logger.getLogger(Runner.class);

	enum Message {
		FATAL, ERROR, DEBUG, INFO, WARN;
	}

	public static void main(String[] args) {
		Random randomCountRecord = new Random();
		int countLogMessages = MIN_COUNT_RECORD + randomCountRecord.nextInt(RANGE_TO_COUNT_RECORD);

		for (int i = 0; i < countLogMessages; i++) {
			Random randomType = new Random();
			Message messageType = Message.values()[randomType.nextInt(RANGE_ENUM_VALUES)];
			switch (messageType) {
			case FATAL:
				LOG.fatal("Fatal message");
				break;
			case ERROR:
				LOG.error("Error message");
				break;
			case DEBUG:
				LOG.debug("Debug message");
				break;
			case INFO:
				LOG.info("Information message");
				break;
			case WARN:
				LOG.warn("Waring message");
				break;

			default:
				break;
			}
		}
	}
}
