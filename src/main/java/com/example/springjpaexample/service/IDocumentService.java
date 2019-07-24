package com.example.springjpaexample.service;

import java.util.Optional;

import com.example.springjpaexample.model.Employee;

public interface IDocumentService {
	public Optional<Employee> fetchDocument(Integer id);
	
	public void insertDocument(Employee employee);
}
