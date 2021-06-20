## Autowiring

#### Autowiring:
Spring container will detect dependencies and inject those automatically but in case of manual wiring we specify the dependencies in the xml configuration file. Lines of XML code can be reduced because we will not specify the property name, constructor-arg in the beans.

#### Types of Autowiring:

1. By Name: byName
2. By Type: byType
3. Constructor: constructors

##1. By Type

Syntax:
``<bean id="beanId" class="com.BeanClassName" autowirer="byType"/>``

Example is in: com.autowire.bytype package which uses appcontext_bytype.xml

Some points to remember:

1. Autowiring by byType uses setter method to inject Object.
2. it does not bother about the name and id of the bean i.e. these things need not be matched. Only type has to be matched.
3. Spring container scans all the setter of the class and for every setter arg. in the class it
checks for the entry in the config. XML file. If found, it injects the object.
4. If there are more then one entry of bean for a class and other class(where it needs to be injected) has reference of it but not as List<InjectableObject> then Spring container confuse to inject one of the bean entry HENCE it gets errored out.

5. If there are more then one bean entry in the xml for a class and this class has a List or Array list reference then all the listede beans are injected as member of the list.