package com.techelevator.projects.model;

import java.time.LocalDate;
import java.util.Objects;

public class Project {
	private int id;
	private String name;
	private LocalDate fromDate;
	private LocalDate toDate;

	public Project() {}

	public Project(int id, String name, LocalDate fromDate, LocalDate toDate) {
		this.id = id;
		this.name = name;
		this.fromDate = fromDate;
		this.toDate = toDate;
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
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return name;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Project project = (Project) o;
		return id == project.id && name.equals(project.name) && fromDate.equals(project.fromDate) && toDate.equals(project.toDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, fromDate, toDate);
	}
}
