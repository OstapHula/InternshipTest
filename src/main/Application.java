package main;

import institution.University;
import institution.interlink.Internship;

import java.util.ArrayList;
import java.util.List;

import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        fillUniversity(university);

        Internship internship = new Internship("Interlink");
        
        internship.setStudents(university.getStudents());
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
    
    private static void fillUniversity(University university){
    	List<Student> listOfStudents = new ArrayList<>();
    	
    	Student stud1 = new Student();
    	stud1.setName("Andrew Kostenko");
    	stud1.setKnowledge(new Knowledge(60));
    	stud1.setUniversity(university);
    	listOfStudents.add(stud1);
    	
    	Student stud2 = new Student("Julia Veselkina", 70);
    	stud2.setUniversity(university);
    	listOfStudents.add(stud2);
    	
    	listOfStudents.add(new Student("Maria Perechrest", new Knowledge(90), university));
    	
    	university.setStudents(listOfStudents);
    }
    
    //other realization fill method
    private static void fillUniversity(){
    	
    }
}
