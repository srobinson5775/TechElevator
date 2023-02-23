package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee; ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()){
			Employee employee = mapRowToEmployee(results);
			employees.add(employee);
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employeesByName = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date "+
					"FROM employee " +
					"WHERE first_name ILIKE ? AND last_name ILIKE ?; ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,  "%" + firstNameSearch + "%" , "%" + lastNameSearch + "%");
		while (results.next()) {
			employeesByName.add(mapRowToEmployee(results));
		}
		return employeesByName;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		List<Employee> employeesByProjectId = new ArrayList<>();
		String sql = "SELECT e.employee_id, e.department_id, e.first_name, e.last_name, e.birth_date, e.hire_date " +
					"FROM employee e " +
					"JOIN project_employee pe ON e.employee_id = pe.employee_id " +
					"WHERE pe.project_id = ?; ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while (results.next()){
			Employee employee = mapRowToEmployee(results);
			employeesByProjectId.add(employee);
		}
		return employeesByProjectId;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
		String sql = "INSERT INTO project_employee (project_id, employee_id)" +
					"VALUES (?, ?); ";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
		String sql = "DELETE FROM project_employee employee_id " +
					"WHERE project_id = ? AND employee_id = ?; ";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employeesWithNoProjects = new ArrayList<>();
		String sql = "SELECT e.employee_id, e.department_id, e.first_name, e.last_name, e.birth_date, e.hire_date " +
					"FROM employee e " +
					"JOIN project_employee pe ON pe.employee_id = e.employee_id " +
					"WHERE pe.project_id IS NULL; ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()){
			Employee employee = mapRowToEmployee(results);
			employeesWithNoProjects.add(employee);
		}
		return employeesWithNoProjects;
	}

	private Employee mapRowToEmployee(SqlRowSet rowSet) {
		Employee employee = new Employee();
		employee.setId(rowSet.getInt("employee_id"));
		employee.setDepartmentId(rowSet.getInt("department_id"));
		employee.setFirstName(rowSet.getString("first_name"));
		employee.setLastName(rowSet.getString("last_name"));
		employee.setBirthDate(rowSet.getDate("birth_date").toLocalDate());
		employee.setHireDate(rowSet.getDate("hire_date").toLocalDate());

		return employee;
	}


}
