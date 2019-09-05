package com.travis.collaboration.factory;

import org.junit.Test;

import junit.framework.TestCase;

public class PersistorFactoryTest extends TestCase {

	@Test
	public void testGetEncodedPersistor() {
		BasePersistor p = PersistorFactory.getPersistor(PersistorType.ENCODED);
		assertTrue(p instanceof EncodedTextPersistor);
	}

	@Test
	public void testGetPlainPersistor() {
		BasePersistor p = PersistorFactory.getPersistor(PersistorType.PLAIN);
		assertTrue(p instanceof PlainTextPersistor);
	}
	
	@Test
	public void testWriteToEncodedTextPersistor() {
		BasePersistor p = PersistorFactory.getPersistor(PersistorType.ENCODED);
		assertTrue(p instanceof EncodedTextPersistor);
		p.persist("Hello there".getBytes(), "./src/test/resources/encodedtext.file");
	}

	@Test
	public void testWriteToPlainTextPersistor() {
		BasePersistor p = PersistorFactory.getPersistor(PersistorType.PLAIN);
		assertTrue(p instanceof PlainTextPersistor);
		p.persist("Hello there".getBytes(), "./src/test/resources/plaintext.file");
	}

}
