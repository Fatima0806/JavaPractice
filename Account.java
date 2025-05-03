
public class Account {

	String iban;
	int pin;
	double balance;
	
	public Account(String iban, int pin, double balance) {
		this.iban = iban;
		this.pin = pin;
		this.balance = balance;
	}
	
	public Account(String iban, int pin) {
		this(iban, pin, 0.0);
	}
	
	public String getiban() {
		return iban;
	}
	public double getbalance() {
		return balance;
	}
	
	public double getPIN() {
		return pin;
	}
	
	public void deposit(double value) {
		balance = balance + value;
	}
	
	public void withdraw(double value) {
		balance = balance - value;
	}
	
	
	public String toString() {
		return "IBAN" + iban + ", Balance" + balance;
	}
	
	public void print() {
		System.out.println(this);
	}
	
	public boolean equals(String obj) {
		return false;
	}
	
	public static String fix(String input) {
		 if (input == null) {
		        return null;
		    }
		return input.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
	}
	
	public static boolean validate(String iban) {
		if (iban == null) 
		return false;
		
		String fixedIban = fix(iban);
		
		 if (!fixedIban.startsWith("DE") || fixedIban.length() != 22) {
		        return false;
		    }
		 String rearranged = fixedIban.substring(4) + fixedIban.substring(0,4);
		 
		 String numericIban = "";
		 for (int i = 0; i < rearranged.length(); i++) {
			 char c = rearranged.charAt(i);
			 if (Character.isDigit(c)) {
		            numericIban += c;
		        } else if (Character.isLetter(c)) {
		            numericIban += ((int) c - 'A' + 10);
		        }
		 }
		 
		 try {
		        java.math.BigInteger ibanNumber = new java.math.BigInteger(numericIban.toString());
		        return ibanNumber.mod(java.math.BigInteger.valueOf(97)).intValue() == 1;
		    } catch (NumberFormatException e) {
		        return false; // in case something went wrong during conversion
		    }
	}
	
}
