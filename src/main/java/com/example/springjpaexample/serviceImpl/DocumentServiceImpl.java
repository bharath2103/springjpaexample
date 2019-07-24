package com.example.springjpaexample.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjpaexample.model.Employee;
import com.example.springjpaexample.repository.DocumentRepository;
import com.example.springjpaexample.service.IDocumentService;

@Service
public class DocumentServiceImpl implements IDocumentService {
	
	@Autowired
	private DocumentRepository documentRepository;
	
	public Optional<Employee> fetchDocument(Integer id) {
		return documentRepository.findById(id);
	}
	
	public void insertDocument(Employee employee) {
		documentRepository.save(employee);
	}
	
	

}
