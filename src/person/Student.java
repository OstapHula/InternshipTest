package person;

import institution.University;
import person.consciousness.Knowledge;

public class Student {
	
	private String name;
	private Knowledge knowledge;
	private University university;
	
	public Student(String name, Knowledge knowledge, University university) {
        this.name = name;
        this.knowledge = knowledge;
        this.university = university;
    }
	
	public Student(String name, int knowlege){
		 this.name = name;
	     this.knowledge = new Knowledge(knowlege);
	}
		
	public Student() {
    	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Knowledge getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(Knowledge knowledge) {
		this.knowledge = knowledge;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

    @Override
	public String toString() {
		return "Student [name=" + name + ", knowledge=" + knowledge.getLevel()
				+ ", university=" + university + "]";
	}

}

