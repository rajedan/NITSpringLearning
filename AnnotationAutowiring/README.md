### Autowiring with Annotation(s)

- Create a class and mark it with ``@Configuration`` This indicates that Spring can use this class to get the Bean definitions just like an XML file(How we use to have)

- Create methods into this bean which should create and return bean object. By default method name is the bean id which we will use to get the bean object by using ``context.getBean("beanId")``

- By default beans are singleton and eager loading.

- ``@Bean("beanId")`` Here, beanId represents custom bean id.

- If there are two beans present in the config file(java file) then we will not get any error on app context creation. If we try to getBean on that ID then we get the bean object from the first defined bean method in the config file. Check ``AppConfig.java``