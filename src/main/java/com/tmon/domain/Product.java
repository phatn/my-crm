package com.tmon.domain;

public class Product {
	
	private Long id;
	
	private String name;

	private double price;
	
	private double salePrice;
	
	private Integer age;
	
	public double calAverage() {
		return (price + salePrice) * 1.0 /2;
	}

	public Product(Long id, String name, double price, double salePrice, Integer age) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.salePrice = salePrice;
		this.age = age;
	}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
