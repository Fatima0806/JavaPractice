
public class Student extends Person{

	String studentNumber;
	
	public Student(String lastName, String firstName, String studentNumber) {
		super(lastName, firstName);
		this.studentNumber = studentNumber;
	}
	
	public String getStudentNumber() {
		return studentNumber;
		
	}
	
	public void update(String lastName, String firstName, String studentNumber) {
		super.update(lastName, firstName);
		this.studentNumber = studentNumber;
	}
	
	public String generateId() {
		String studentId = lastName + "-" + firstName + "-" + studentNumber;
		return studentId;
		
	}
	
	public String toString() {
	    return "Student(" + super.toString() + ")";
		
	}
}
