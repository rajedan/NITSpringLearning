## ``java session.get() `` VS ``java session.load() `` API

``java session.get() ``
- Get API loads data based on the primary key provided as below:
``java session.get(Student.class, 100);``
this loads student table record which has 100 as Id

- If data is not found with provided id then it returns NULL.

- when get api is called on session, it instantly fires select query.



``java session.load() ``
- load API loads data based on the primary key provided as below:
``java session.load(Student.class, 100);``

- If data is not found with provided id then it throws an error.

- when load api is called on session, it does not fires select query to DB until the returned object(proxy object) is accessed/used. If session is closed and user tries to use the proxy object then It throws an exception.

Example:

``java 

Student student = session.load(Student.class, 100);
session.close();
System.out.print(student);

``
The above example will throw an error irrespective of whether student record exist with id 100