package service.impl;

import java.util.ArrayList;
import java.util.List;

import person.Student;
import service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Andrew Kostenko", 75));
		students.add(new Student("Julia Veselkina", 80));
		students.add(new Student("Maria Perechrest", 70));
		return students;
	}

}
