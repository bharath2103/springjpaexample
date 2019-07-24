package com.example.springjpaexample.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class JmsRouter extends RouteBuilder{
	
	//@Autowired
	//private TestController testController;

	@Override
	public void configure() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		from("{{input.queue}}")
		//     .log(LoggingLevel.DEBUG, log, "New message received")
		.process(exchange -> {
			String convertedMessage = exchange.getMessage().getBody().toString();
			//MetaData doc = mapper.readValue(convertedMessage, MetaData.class);
			//exchange.getMessage().setBody(mapper.writeValueAsString(testController.testDocumentContext(doc)));
		})
		.to("{{output.queue}}")
		//        .log(LoggingLevel.DEBUG, log, "Message sent to the other queue")
		.end();
	}
}
