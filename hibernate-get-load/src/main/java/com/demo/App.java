package com.demo;

/**
 * Hello world!
 *
 */
public class App {

	private static void loadData(StudentDaoImpl impl, int id) {
		try {
			Student st1 = impl.getStudentById(id);
			System.out.println(st1);

			Student st2 = impl.loadStudentById(id);
			System.out.println(st2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		StudentDaoImpl impl = new StudentDaoImpl();
		loadData(impl, 10);
		loadData(impl, 100);
	}
}
