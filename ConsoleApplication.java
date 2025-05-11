import java.util.Scanner;

public class ConsoleApplication {

	public void inputValuesFromConsole(IDataInput datainput) {
		
		Scanner scanner = new Scanner(System.in);
		
		String key;
		while ((key = datainput.nextKey()) != null) {
			System.out.print(key + ": ");
			String input = scanner.nextLine();
			datainput.setNextValue(input);
		}
		
	}
	
	public void outputValuesFromConsole(IDataOutput dataoutput) {
		for(String line: dataoutput.information()) {
			System.out.print(line);
		}
	}

	
}
