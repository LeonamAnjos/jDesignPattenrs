package br.com.designpatterns.behavioral.NullObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {

	public boolean isFileLoggingEnbled() throws FileNotFoundException {
		Properties p = new Properties();
		
		try {
			p.load(ClassLoader.getSystemResourceAsStream("Logger.properties"));
			
			String fileLoggingValue = p.getProperty("FileLogging");
			return fileLoggingValue.equalsIgnoreCase("ON");
		} catch(IOException e) {
			return false;
		}
	}
	
	public Logger getLogger() {
		try {
			if (isFileLoggingEnbled())
				return new FileLogger();
			
			return new ConsoleLogger();
		} catch (Exception e) {
			return new NullLogger();
		}
	}
}