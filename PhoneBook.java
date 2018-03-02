import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
	public static void main (String[] args) {
		boolean notQuit = true;
		Map<String, String> phoneBook = new HashMap<String, String>();
		System.out.println("Welcome to the Phone Book");
		Scanner s = new Scanner(System.in);
		while(notQuit) {
			System.out.println("Enter A to add a person, S to search for a person, P to print the entire phone book, or Q to quit.");
			String in = s.nextLine();
			if (in.toLowerCase().contains("A")) {
				System.out.println("Enter the subject's name");
				String name = s.nextLine();
				System.out.println("Enter the subject's number in the format (XXX)-XXX-XXXX");
				String num = s.nextLine();
				phoneBook.put(name, num);
				System.out.println("Added "+name+"'s"+" number, which is "+ num);
			} else if (in.toLowerCase().contains("p")) {
				phoneBook.forEach( (name, number) -> System.out.println(name + "'s number is " + number) );
			} else if (in.toLowerCase().contains("q")) {
				notQuit = false;
			} else if (in.toLowerCase().contains("s")) {
				System.out.println("Enter the subject's name");
				String name = s.nextLine();
				if (phoneBook.get(name)!= null) {
					System.out.println(name + "'s number is " + phoneBook.get(name));
				} else {
					System.out.println("That name does not exist within this phonebook or may or may not have a capital letter in the beginning.");
				}
			}
		}
	}
}
