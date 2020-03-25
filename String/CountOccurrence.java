import java.util.HashMap;
public class CountOccurrence {
	private static HashMap<String, Integer> map = new HashMap<>();
	public static void main(String[] args) {
		String input = new java.util.Scanner(System.in).nextLine();
		System.out.println("Input is: " + input);
		String[] arr = input.split(" ");
		for (var i = 0; i < arr.length; i++) {
			count(arr[i].split(""));
		}

		map.forEach((k,v)-> {
			System.out.println( k + "\t" + v);
		});
	}

	private static void count(String[] s) {
		if ( s.length == 0 ) return;
		for (var i = 0; i < s.length; i++) {
			map.merge(s[i],1,(v1,v2) -> v1+v2);
		}
	}
}
