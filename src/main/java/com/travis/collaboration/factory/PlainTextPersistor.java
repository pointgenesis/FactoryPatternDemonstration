package com.travis.collaboration.factory;

public class PlainTextPersistor extends BasePersistor {

	public PlainTextPersistor() {
		log.info("Constructed a PlainTextPersistor");
	}
	
	@Override
	protected String transform(byte[] content) {
		String value = new String(content);
		return value;
	}
}
