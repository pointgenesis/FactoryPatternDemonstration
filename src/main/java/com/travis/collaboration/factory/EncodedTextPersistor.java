package com.travis.collaboration.factory;

import java.util.Base64;

public class EncodedTextPersistor extends BasePersistor {

	public EncodedTextPersistor() {
		log.info("Constructed an EncodedTextPersistor object.");
	}
	
	@Override
	protected String transform(byte[] content) {
		return Base64.getEncoder().encodeToString(content);
	}
}
