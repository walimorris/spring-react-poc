package io.com.morris.emerald01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class Emerald01Application {

	private static final Logger logger = LoggerFactory.getLogger(Emerald01Application.class);

	public static void main(String[] args) throws MalformedURLException {
		SpringApplication.run(Emerald01Application.class, args);
		logger.info("Application running at: " + new URL("http://localhost:8081/"));
	}
}
