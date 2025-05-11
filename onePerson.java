
public class onePerson implements IDataInput, IDataOutput, Comparable<onePerson>{
	
	private String name;
	private String email;

	@Override
	public String[] information() {
		// TODO Auto-generated method stub
		return new String[] {name, email};
	}

	@Override
	public String nextKey() {
		if (name == null || name.isEmpty()) {
			return "Name";
			}else if (email == null|| email.isEmpty()) {
				return "Email";
			}else {
				return null;
			}
	}

	@Override
	public void setNextValue(String value) {
		if (name == null || name.isEmpty()) {
			name = value;
		}else if (email == null || email.isEmpty()) {
			email = value;
		}
	}
	
	public int compareTo(onePerson other) {
		return this.name.compareTo(other.name);
	}
	
	public static void main(String[] args) {
	    onePerson person = new onePerson();
	    ConsoleApplication controller = new ConsoleApplication();
	    controller.inputValuesFromConsole(person);
	    controller.outputValuesFromConsole(person);
	}



	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

}
