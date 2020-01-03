import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class FindDuplicateChar {
	
	private static Set<Character> set = new HashSet<>(); 
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String string = sc.next();
		String dup = findDuplicate(string);
		if (dup.length() >= 1) System.out.println("Duplicates :" + dup);
		else System.out.println("No duplicates");
	}
	
	private static String findDuplicate(String string) {
		char[] charArray = string.toCharArray();
		String duplicateChars = "";
		for (char ch : charArray) {
			boolean result = set.add(ch);
			if(result) continue;
			duplicateChars += " " + ch;
		}
		
		return duplicateChars;
	}
	
}
