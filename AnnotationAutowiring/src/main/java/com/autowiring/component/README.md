### Component and ComponentScan

- ``@Component`` annotation is used to mark a class to be scanned by SPring conteiner while scanning for Bean objects

- ``@ComponentScan`` is used in AppConfig java file to tell spring that Spring Container has to scan the current and sub-directory of current package to scan for bean classes. it scans ``@Component`` marked classes and create bean objects.

- ``@ComponentScan(basePackage="com.mypkg")`` or ``@ComponentScan(basePackage={"com.mypkg", "com.anotherpkg"})`` to be used to specify package or list of package to be scanned by SPring Container.



- @Bean - method level annotation used in @Configuration class
@Component - Class level annotation to mark a class for bean object creation

- @Bean - developer has more control on object creation with this method of object creation
@Component - Automatically bean is created with this annotation