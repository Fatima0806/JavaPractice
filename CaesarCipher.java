
public class CaesarCipher {

	public static String encrypt(String text, int key) {
		String result = "";
		
		for(int i=0; i < text.length(); i++) {
			char c = text.charAt(i);
			
			
			if (Character.isUpperCase(c)) {
                char shifted = (char) (((c - 'A' + key) % 26) + 'A');
                result += shifted;
               } else if (Character.isLowerCase(c)){
                   char shifted = (char) (((c - 'a' + key) % 26) + 'a');
                  result += shifted;
                  } else {
                	  result += c;
                  }
		}
		return result;
	}
	
	public static void main(String args[]) {
		String text = "Hello!";
		int key = 2;
		
		String encrypted = encrypt(text, key);
		System.out.print("Encrypted message:" + encrypted);
	}
}
