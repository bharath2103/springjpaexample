package com.example.springjpaexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name="employee")
public class Employee {
	
	@Id
	private Integer id;
	
	private String name;
	
	private Integer age;

}
