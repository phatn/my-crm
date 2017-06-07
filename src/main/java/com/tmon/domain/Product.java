package com.tmon.domain;

public class Product {
	
	private Long id;
	
	private String name;

	private Integer age;


	public void printMe() {
		System.out.println("name: " + name + ", age: " + age);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
