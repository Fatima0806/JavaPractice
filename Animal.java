
public class Animal implements IDataInput, IDataOutput{

	private String name;
	private int age;
	
	@Override
	public String[] information() {
		return new String[] {name, String.valueOf(age)};
	}

	@Override
	public String nextKey() {
		if (name == null || name.isEmpty()) {
			return "Name";
			}else if (age == 0) {
				return "Age";
			}else {
				return null;
			}
	}

	@Override
	public void setNextValue(String value) {
		if (name == null || name.isEmpty()) {
			name = value;
		}else if (age == 0) {
			try {
			age = Integer.parseInt(value);
			}catch (NumberFormatException e) {
	            System.out.println("Invalid age input: " + value);

			}
		}
	}
	
	public static void main(String[] args) {
	    Animal animal = new Animal();
	    ConsoleApplication controller = new ConsoleApplication();
	    controller.inputValuesFromConsole(animal);
	    controller.outputValuesFromConsole(animal);
	}
	
	

}
