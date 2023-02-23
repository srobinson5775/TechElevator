package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
		Project project = null;
		String sql = "SELECT project_id, name, from_date, to_date " +
					"FROM project " +
					"WHERE project_id = ?; ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		if(results.next()){
			project = mapRowToProject(results);
		}
		return project;
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> allProjects = new ArrayList<>();
		String sql = "SELECT project_id, name, from_date, to_date " +
					"FROM project " +
					"WHERE project_id = ?; ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {
			Project project = mapRowToProject(results);
			allProjects.add(project);
		}
		return allProjects;
	}

	@Override
	public Project createProject(Project newProject) {
		String sql = "INSERT INTO project (name, from_date, to_date) " +
					"VALUES (?, ?, ?) RETURNING project_id; ";
		int project = jdbcTemplate.queryForObject(sql, Integer.class,
						newProject.getFromDate(), newProject.getToDate(), newProject.getName());
		newProject.setId(project);
		return newProject;
	}

	@Override
	public void deleteProject(int projectId) {
		String sql = "DELETE FROM project" +
					"WHERE project_id = ?; ";
		jdbcTemplate.update(sql,projectId);
		sql = "DELETE FROM project WHERE project_id = ?;";
		jdbcTemplate.update(sql, projectId);



	}
	private Project mapRowToProject(SqlRowSet rowSet){
		Project project = new Project();
		project.setId(rowSet.getInt("project_id"));
		project.setName(rowSet.getString("name"));
		Date date = rowSet.getDate("from_date");
		if (date != null) {
			project.setFromDate(rowSet.getDate("from_date").toLocalDate());
		}
		Date date1 = rowSet.getDate("to_date");
		if(date1 != null) {
			project.setToDate(rowSet.getDate("to_date").toLocalDate());
		}


		return project;
	}
	

}
