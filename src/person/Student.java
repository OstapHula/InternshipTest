package person;

import institution.University;
import person.consciousness.Knowledge;

public class Student {
	
	private String name;
	private Knowledge knowledge;
	private University university;
	
	public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }
		
    public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}
	
    public Knowledge getKnowledge(){
    	return knowledge;
    }
    
    public String getName(){
    	return name;
    }
}
