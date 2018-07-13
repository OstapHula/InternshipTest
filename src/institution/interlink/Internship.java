package institution.interlink;

import institution.University;

import java.util.ArrayList;
import java.util.List;

import person.Student;

public class Internship {
	
	private String name;
	private List<Student> students = new ArrayList<>();
	
    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        if(student.getKnowledge().getLevel() >= arithmeticMean(student.getUniversity()))
        	students.add(student);
    }
    
    private int arithmeticMean(University university){
    	List<Student> list = university.getStudents();
    	int sum = 0;
    	for(Student person : list){
    		sum += person.getKnowledge().getLevel();
    	}
    	return sum/list.size();
    }

    public String getStudents() {
    	if(students.isEmpty()) return null;
    	String persons = "";
    	for(Student person : students){
    		persons += person.getName() + "\n";
    	}
        return persons;
    }
    
    public void setStudents(List<Student> students) {
		for (Student student : students) {
			this.setStudent(student);
		}
	}
}
