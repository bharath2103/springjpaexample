package com.example.springjpaexample;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springjpaexample.model.Employee;
import com.example.springjpaexample.service.IDocumentService;

@Controller
public class SampleController {
	
	@Autowired
	private IDocumentService documentService;

	@ResponseBody
	@GetMapping(value="/sayhello")
	public String sample() {
		return "Helloworld";
	}
	
	@ResponseBody
	@GetMapping(value="/getDocument")
	public Employee getDocument(@RequestParam("id") Integer id) {
		Optional<Employee> fetchDocument = documentService.fetchDocument(id);
		return fetchDocument.get();
	}
	
	public void testDocumentContext() {
		System.out.println("MQ Triggered");
	}
	
	
	
	
}
