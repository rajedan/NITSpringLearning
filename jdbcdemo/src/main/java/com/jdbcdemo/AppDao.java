package com.jdbcdemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

@Component
public class AppDao {

	@Autowired
	JdbcTemplate jdbcTemplate1;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate1;

	/**
	 * Save Student using jdbc template
	 */
	public void saveStudentUsingJDBCTemplate() {
		int count = jdbcTemplate1.update("insert into student values(?,?,?)", 
				101, "TestStudent", "India");
		System.out.println(count + " record inserted");
	}

	
	/**
	 * Save Student using named parameter jdbc template
	 */
	public void saveStudentUsingNamedParamJDBCTemplate() {
		Map<String, Object> inputs = new HashMap<String, Object>();
		inputs.put("sName", "TestStudent2");
		inputs.put("sId", 102);
		inputs.put("sAddress", "India");

		int count = namedParameterJdbcTemplate1.update(
				"insert into student(studentId, address, studentName)" 
						+ " values(:sId, :sAddress, :sName)", inputs);
		System.out.println(count + " record inserted in saveStudentUsingNamedParamJDBCTemplate");
	}
	
	/**
	 * Save Student using named jdbc template with named parameter(Sql Parameter)
	 */
	public void saveStudentUsingNPJTemplateWithSQLMap() {
		SqlParameterSource inputs = new MapSqlParameterSource()
				.addValue("sName", "TestStudent3")
				.addValue("sId", 103)
				.addValue("sAddress", "India");
		int count = namedParameterJdbcTemplate1.update("insert into student(studentName, studentId, address) "
				+ "values(:sName, :sId, :sAddress)", inputs);
		System.out.println(count + " record inserted using saveStudentUsingNPJTemplateWithSQLMap");
	}
	
	/**
	 * Saving student using Simple JDBC Insert. This can be used only for insertion
	 * We need not specify SQL Query in java code.
	 */
	public void saveStundentUsingSimpleJDBCInsert() {
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate1)
				.withTableName("student");
		Map<String, Object> inputMap = new HashMap<String, Object>();
		inputMap.put("studentName", "TestStudent4");
		inputMap.put("address", "India");
		inputMap.put("studentId", 104);
		
		int count = jdbcInsert.execute(inputMap);
		
		System.out.println(count + " record inserted by saveStundentUsingSimpleJDBCInsert");
	}
}
