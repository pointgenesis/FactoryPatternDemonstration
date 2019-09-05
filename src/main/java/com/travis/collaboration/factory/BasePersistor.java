package com.travis.collaboration.factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BasePersistor {
	static final Logger log = LogManager.getLogger();
	
	public void persist(byte[] content, String filename) {
		if (content.length == 0) {
			throw new IllegalArgumentException("Variable content cannot be zero bytes in length.");
		}
		
		if (filename == null || filename.trim().equals("")) {
			throw new IllegalArgumentException("Variable filename cannot be null or empty.");
		}
		
		/**
		 * If a PlainTextPersistor then just transform content to a String.
		 * If a EncodedTextPersistor then base64 encode the content before converting to a String. 
		 */
		String value = transform(content);
		
		if (save(value, filename)) {
			log.info("value: {} was saved successfully to filename: {}.", value, filename);
		}
	}
	
	protected abstract String transform(byte[] content);
	
	private boolean save(String value, String filename) {
		boolean isSuccessful = false;
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
			writer.write(value);
			isSuccessful = true;
		} catch (IOException e) {
			log.warn("Unable to save filename: {}", filename);
		}
		
		return isSuccessful;
	}
}