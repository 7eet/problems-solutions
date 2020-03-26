public class RemoveWhitespace {
	public static void main(String... args) {
		String line = new java.util.Scanner(System.in).nextLine();
		System.out.println("Your input is: " + line);

		String result = removeWhitespace(line);	
		System.out.println("Result is: " + result);
	}

	private static String removeWhitespace(String line) {
		String result = "";
		String[] arr = line.split("");
		for (var i = 0; i < arr.length; i++) {
			if (arr[i].trim().length() == 0) continue;
			result += arr[i];
		}
		return result;
	}
}
