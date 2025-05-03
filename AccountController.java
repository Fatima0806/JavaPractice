import java.util.Scanner;

public class AccountController {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Account[] accounts = {
	            new Account("DE02500105170137075030", 1234, 1000.0),
	            new Account("DE91100000000123456789", 2345, 1500.0),
	            new Account("DE02100100100006820101", 3456, 2000.0),
	            new Account("DE02120300000000202051", 4567, 2500.0)
	        };
		
		System.out.print("Enter IBAN: ");
		String inputIban = scanner.nextLine();
		inputIban = Account.fix(inputIban);
		
		System.out.print("Enter Pin: ");
		int inputPin = scanner.nextInt();
		
		if(!Account.validate(inputIban)) {
			System.out.println("Incorrect Iban");
			return;
		}
		
		boolean loggedIn = false;
		for (Account acc: accounts) {
			 if (acc.getiban().equals(inputIban)) {
	                if (acc.getPIN() == inputPin) {
	                    loggedIn = true;
	                    System.out.println("Login successful!");
	                    System.out.println("Your balance is: " + acc.getbalance());
	                } else {
	                    System.out.println("Wrong PIN for this IBAN.");
	                }
	                break;  // IBAN found; no need to check others
	            }
		}
	
		if(!loggedIn) {
			System.out.println("Login failed, incorrect IBAN or pin");
		}
		
		scanner.close();
	}
}
