## Sorting App Example

This is also an example of Strategy Design Pattern

![LLD-Diagram](./SortingDemoApp.jpg)

- The above example is to demonstrate how to use ``@Qualifier`` and ``@Primary`` with interface and concrete classes of it.

- ``@Primary`` annotation can be used in class and method level. ``@Primary`` can be used with ``@Bean`` while we declare Bean in the Java Configuration file. ``@Primary`` can also be used with ``@Component`` in the class level.

- In above example, Bubble and Merge are of same type of Sorter interface.
- In order to mention which Bean should be injected, we can use ``@Qualifier`` with ``@Autowired``
- ``@Primary`` is used in Config file in Bean declaration or class level with @Component to mention which Bean should be preffered while injecting a Bean, where there are more then one Beans are present of same type. for example: Here Bubble and Merge are of same type and one of them can be marked as ``@Primary`` while declaring the bean of it in Config file or in it's class along with ``@Component``