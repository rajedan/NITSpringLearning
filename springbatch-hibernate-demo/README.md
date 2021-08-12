# Hibernate Basics


## Steps to create Hibernate application (this is without Spring)

1. Create a maven project.
2. Add hibernate and DB Driver dependencies as below:

```xml
	<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.49</version>
		</dependency>


		<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>5.4.27.Final</version>
		</dependency>
```
3. Create ``hibernate.cfg.xml`` file which is configuration file for hibernnate. Specify username, password, url etc.
4. Create an Entity Class(Check Student.class in this example)
5. Create a DAO and create a method to do CRUD operation. Session is mendatory for any CRUD operation in hibernate.

Example:
```java
SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
Session session = factory.getCurrentSession();
session.getTransaction().begin();
session.save(student);
session.getTransaction().commit();
```