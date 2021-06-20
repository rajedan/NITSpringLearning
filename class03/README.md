# Dependency Injection (XML Based Manual Wiring)

- Manual wiring/DI based on XML config file.
- This is based on setter method and bean and bean property tags in nthe xml config files.

```
1. <bean id="employee" class="com.learning.spring.Employee">
2.     <property name="department" ref="department"></property>
3. </bean>
4. <bean id="department" class="com.learning.spring.Department"></bean>
```

- If property name is "department" as shown in line 2 then Employee bean must have setDepartment as setter for department variable.
- ref value "department" in line 2 must match with bean id of the department which is shown in line 4 

--------------------
## Constructor based Manual wiring
```
<bean id="employee" class="com.learning.spring.conswiring.Employee">
    <constructor-arg name="department" ref="department"> </constructor-arg>
</bean>
<bean id="department" class="com.learning.spring.conswiring.Department"></bean>
```

<b>Manual Wiring</b>: Specifying the reference/object type dependencies into configuration file either though 
constructor or through setter/property way of doing it as shown in above two examples.

Autowiring: SPring container will detect dependencies and inject those automatically but in case of manual wiring we specify the dependencies in the xml configuration file.
Lines of XML code can be reducced because we will not specify the property name, constructor-arg in the beans.


Types of Autowiring:
1. By Name: byName
2. By Type: byType
3. Constructor: constructors