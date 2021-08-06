# Spring JDBC

This project is to demo Spring JDBC Connection and CRUD operation on a table

## Ways to use JDBC with Spring

1. JdbcTemplate
2. NamedParameterJdbcTemplate

## Steps for Connection

1. Create a Configuration file(Java file with @Connfiguration annotation and @ComponentScan)
2. Create bean for datasource as below. Datasource is from ``javax.sql.DataSource``

```java
	@Bean
	public DataSource datasource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}
```
3. Create Bean for JdbcTemplate and NamedParameterJdbcTemplate
``org.springframework.jdbc.core.JdbcTemplate``
``org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate``

```java
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(datasource());
	}
	
	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
		return new NamedParameterJdbcTemplate(datasource());
	}
```