package com.isquarebsys.rest;

public class Product {
	public Product() {
	}

	public Product(Integer id, String name, String cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	private Integer id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	private String cost;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
}
