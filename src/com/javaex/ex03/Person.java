package com.javaex.ex03;

public class Person {
	
	//field
	private String name;
	private String hp;
	private String company;
	
	
	
	// constructors
	public Person() {
		super();
	}
	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	
	
	// method getter/setter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getHp() {
		return hp;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	
	// method
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("핸드폰: " + hp);
		System.out.println("회사: " + company);
		System.out.println();
	}

}
