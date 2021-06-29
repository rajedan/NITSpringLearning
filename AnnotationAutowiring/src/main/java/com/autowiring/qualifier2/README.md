## Using @Qualifier annotation for Bean configuration declaration

- while we declare a Bean using ``@Bean`` annotation we can use ``@Qualifier`` to mention the name of the Bean. for example:

```
	@Bean(name = "dept")
	@Qualifier("dept-qual")
	public Department department1() {
		System.out.println("creating-dept");
		return new Department();
	}
```
- As per above example, if we Autowire Department Object using ``@Qualifier("dept")`` or ``@Qualifier("dept-qual")`` then both will give same Department Object.

- In the same above example if we do ``context.getBean("dept")`` or ``context.getBean("dept-qual")`` then we will get an Exception on ``context.getBean("dept-qual")`` as ``dept-qual`` is not really considered as bean name by Spring Container.