
public class Lecturer extends Person{

	String telephone;
	int personnelNumber;
	
	public Lecturer(String lastName, String firstName, int personnelNumber, String telephone) {
		super(lastName, firstName);
		this.personnelNumber = personnelNumber;
		this.telephone = telephone;
	}
	
	public int getPersonnelNumber() {
		return personnelNumber;
		
	}
	
	public String getPhone() {
		return telephone;
		
	}
	
	public void update(String lastName, String firstName, int personnelNumber, String telephone) {
		super.update(lastName, firstName);
		this.personnelNumber = personnelNumber;
		this.telephone = telephone;
	}
	
	public String generateId() {
		String lecturerId = lastName + "-" + firstName + "-" + personnelNumber;
		return lecturerId;
		
		
	}
	
	public String toString() {
	    return "Lecturer(" + super.toString() + ", phone=" + telephone + ")";
		
	}
}
