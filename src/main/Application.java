package main;

import institution.University;
import institution.interlink.Internship;
import service.impl.UserServiceImpl;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        university.setStudents(userServiceImpl.getStudents());
        
        Internship internship = new Internship("Interlink");
        
        internship.setStudents(university.getStudents());
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
    
}
