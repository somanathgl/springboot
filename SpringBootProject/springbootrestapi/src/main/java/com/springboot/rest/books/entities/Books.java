package com.springboot.rest.books.entities;


public class Books {
 
	private int id;
	private String name;
	private String Atuthor;
	public Books(int id, String name, String atuthor) {
		super();
		this.id = id;
		this.name = name;
		Atuthor = atuthor;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAtuthor() {
		return Atuthor;
	}
	public void setAtuthor(String atuthor) {
		Atuthor = atuthor;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", Atuthor=" + Atuthor + "]";
	}
	
}
