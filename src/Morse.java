import java.util.Hashtable;
import java.util.Scanner;

public class Morse {
	private Hashtable<Character, String> hash = new Hashtable<Character, String>();
	private String clearMessage = new String();

	public void encrypt() {
		hash.put('a', ".-");
		hash.put('b', "-...");
		hash.put('c', "-.-.");
		hash.put('d', "-..");
		hash.put('e', ".");
		hash.put('f', "..-.");
		hash.put('g', "--.");
		hash.put('h', "....");
		hash.put('i', "..");
		hash.put('j', ".---");
		hash.put('k', "-.-");
		hash.put('l', ".-..");
		hash.put('m', "--");
		hash.put('n', "-.");
		hash.put('o', "---");
		hash.put('p', ".--.");
		hash.put('q', "--.-");
		hash.put('r', ".-.");
		hash.put('s', "...");
		hash.put('t', "-");
		hash.put('u', "..-");
		hash.put('v', "...-");
		hash.put('w', ".--");
		hash.put('x', "-..-");
		hash.put('y', "-.--");
		hash.put('z', "--..");
		hash.put(' ', " ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez la phrase à traduire en morse: ");
		this.clearMessage = sc.nextLine();
		this.clearMessage = this.clearMessage.toLowerCase();
		
		for(int i = 0; i < this.clearMessage.length(); i++) {
			System.out.print(this.hash.get(this.clearMessage.charAt(i)));
		}
	}
}
