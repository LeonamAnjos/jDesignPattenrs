package br.com.designpatterns.behavioral.NullObject;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoggerFactoryTest {

	@Test
	public void should_never_return_a_null_reference_logger() {
		LoggerFactory factory = new LoggerFactory();
		
		Logger logger = factory.getLogger();
		assertNotNull(logger);
	}

}
