package com.tmon.domain;

public class Category {
	
	private Long id;
	
	private String name;
        
    private String level;       

    private String product; 

    public Category() {
    	
    }
    
    public Category(Long id, String name, String level) {
    	this.id = id;
    	this.name = name;
    	this.level = level;
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

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	
}