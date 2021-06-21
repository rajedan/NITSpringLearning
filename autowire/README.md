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


##2. By Constructor

Syntax:
``<bean id="beanId" class="com.BeanClassName" autowirer="constructor"/>``

- autowire with constructor use constructor to inject dependencies
- It is similiar to by type but it also gives preference to matche of the id of bean and name of the constructor parameter.
-Spring container uses greedy way of choosing one constructor if multiple constructor found. Below are the rules which deepects which constructor gets choosen:

Greedy pattern approach :
Spring  will see for the bean id's matching with constructor arguments(parameters) along with types

Matching preferences:

Spring  will check for max arguments constructor(n arguments, this depends on no. of classes)

All of the constructor argument names matching with bean id and class types

Any of the constructor argument name matching with bean id and class type 

Constructor that has arguments taking list arguments

Repeat the steps for (n-1) arguments constructor


##2. By Type
- Uses setter method to inject dependencies
- Matches type i.e. class type of the setter method of class and bean class in the xml.
- If more then one bean entry is found in XML configuration file for a class then Spring container fails to inject this class object due to ambiguity and hence throws an error.