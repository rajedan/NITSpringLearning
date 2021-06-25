## Autowired and Qualifier using java file configuration

- We can declare more then one bean with same Id and we will nont get any error(we have seen this one)

- We can declare more then one bean with different bean Id. But this will error-out while Spring tries to Autowire this object to any other object. Because ``@Autowired`` uses byType autowiring.

- In order to avoid the error, we can use ``@Qualifier`` annotation along with ``@Autowired`` annotation. ``@Qualifier("beanIdToInject")`` this way we will be able to mention the bean id which we want to inject. And this will not error-out.

- Please run ``App.java`` for demo in this package.