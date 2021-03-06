package com.java.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//singleton scope is default
//prototype
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Employee {
	int id;
	String name;
	List<String> projects;
	float salary;
	String[] references;
	Address address;
	public Employee(int id, String name, float salary) {
		System.out.println("Constructor called!");
		this.id= id;
		this.name=name;
		this.salary= salary;
	}
	public void setReferences(String[] references) {
		this.references= references;
	}
}
