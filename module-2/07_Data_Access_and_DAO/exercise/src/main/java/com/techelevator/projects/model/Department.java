package com.techelevator.projects.model;

import java.util.Objects;

public class Department {

	private int id;
	private String name;

	public Department() {}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Department that = (Department) o;
		return id == that.id && name.equals(that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}
