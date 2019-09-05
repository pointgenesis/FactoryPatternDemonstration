package com.travis.collaboration.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersistorFactory {
	static final Logger log = LogManager.getLogger();
	
	private PersistorFactory() {
	}
	
	public static BasePersistor getPersistor(PersistorType type) {
		if (PersistorType.ENCODED == type) {
			return new EncodedTextPersistor();
		} else if (PersistorType.PLAIN == type) {
			return new PlainTextPersistor();
		} else {
			throw new IllegalArgumentException(String.format("Invalid parameter value for type: %s", type.toString()));
		}
	}
}
