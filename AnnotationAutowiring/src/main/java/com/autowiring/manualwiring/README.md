## Manual wiring with AppConfig.java configuration file

- This is a process to autowire an Object without using ``@Autowired`` annotation.
- Here in the example, employee bean declaration contains creation of Employee object and we set department object also. We call department bean declaration method to set the department object into Employee object as shown below.
- Please note that we have not annotated department field or setter method of department in Employee class with ``@Autowired`` annotation.

Example:

```
	@Bean(name="dept1")
	public Department department1() {
		System.out.println("creating-dept1");
		return new Department();
	}

	@Bean(name="emp1")
	public Employee employee1() {
		System.out.println("creating-employee1");
		Employee emp = new Employee();
		emp.setDepartment(department1());
		return emp;
	}
```

### Important Note:
If we do not use ``@Configuration`` in AppConfig.java class in the above example then Spring container creates two Object of Department class
1. While loading Application Context due to Department bean declaration
2. while injecting department object into Employee Object through it's setter method.