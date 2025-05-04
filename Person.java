
public abstract class Person {

	String lastName;
	String firstName;
	
	public Person( String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public abstract String generateId();
	
	public String getLastName() {
		return lastName;
		
	}
	
	public String getFirstName() {
		return firstName;
		
	}
	
	public void update(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;

	}
	
	public String toString() {
	    return "id=" + generateId();
		
	}
}
