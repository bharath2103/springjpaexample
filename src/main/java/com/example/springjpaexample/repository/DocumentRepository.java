package com.example.springjpaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpaexample.model.Employee;

public interface DocumentRepository extends JpaRepository<Employee, Integer> {

}
