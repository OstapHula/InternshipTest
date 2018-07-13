package institution;

import java.util.ArrayList;
import java.util.List;

import person.Student;

public class University {
	
	private String name;
	private List<Student> students = new ArrayList<>();
	
	
    public University(String name) {
        this.name = name;
    }

    public void setStudent(Student[] arrayOfStudents) {
    	for(Student student : arrayOfStudents){
    	  students.add(student);
    	}
    }
    
    public void setStudent(List<Student> listOfStudents){
    	students.addAll(listOfStudents);
    }

    public void addStudent(Student student) {
        students.add(student);
        student.setUniversity(this);
    }
    
    public List<Student> getStudents(){
    	return students;
    }
}
