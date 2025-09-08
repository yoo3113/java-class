package classes;

public class Student {
	int studentId;
	String name;
	int grade;
	
	Student(){
		
	}
	
	Student(int studentId, String name, int grade){
		this.studentId = studentId;
		this.name = name;
		this.grade = grade;
	}
	
	void displayInfo() {
		System.out.println("StudentNmber:" + st1.studentId);
		System.out.println("Name:" + st1.name);
		System.out.println("Grade:" + st1.grade);
	}
}
