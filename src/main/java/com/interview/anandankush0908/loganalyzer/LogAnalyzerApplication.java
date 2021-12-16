package com.interview.anandankush0908.loganalyzer;

import com.interview.anandankush0908.loganalyzer.service.LogAnalyzerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LogAnalyzerApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(LogAnalyzerApplication.class);

	@Autowired
	private LogAnalyzerService logAnalyzerService;

	public static void main(String[] args) {
		SpringApplication.run(LogAnalyzerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Starting execution of analyzeLogs()");
		logAnalyzerService.analyzeLogs(args);
		LOGGER.info("Finished execution of analyzeLogs()");
	}
}
