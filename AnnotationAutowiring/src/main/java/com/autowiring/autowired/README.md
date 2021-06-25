If more then one Bean is declared with same Bean Id which can be of same class type or different. Spring prefers the first declared Bean while it loads the bean.

for example:

```
	@Bean(name="dept")
	public Department department() {
		System.out.println("dept");
		return new Department();
	}
	
	@Bean(name="dept")
	public Department department1() {
		System.out.println("dept1");
		return new Department();
	}
	
	@Bean(name="dept")
	public Employee employee() {
		System.out.println("employee");
		return new Employee();
	}
```
In the above example, first bean ``public Department department()`` is consdered and rest are ignored by Spring.