package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 90));
        university.addStudent(new Student("Julia Veselkina", 60));
        university.addStudent(new Student("Maria Perechrest", 50));

        Internship internship = new Internship("Interlink");
        
        internship.setStudents(university.getStudents());
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
