import java.util.Stack;
public class ReverseString{
    public static void main(String[] args){
	String string = "Hello this is a new String.";
	System.out.println("Given string: "+string);
	System.out.println("Reversed String is: "+reverseUsingArray(string));	
    }
	
	// using char array
    private static String reverseUsingArray(String string){
	char[] charArray = string.toCharArray();
	StringBuilder sb = new StringBuilder();
	for(var i=charArray.length-1;i>=0;i--)
	    sb.append(charArray[i]);
	    
	return sb.toString();
    }
    
    // using character stack
   private static String reverseUsingStack(String input){
		Stack<Character> charStack = new Stack<>();
		for(var i=0;i<input.length();i++){
			charStack.push(input.charAt(i));
		}
		StringBuilder reversedString = new StringBuilder();
		while(!charStack.empty()){
			reversedString.append(charStack.pop());
		}
		return reversedString.toString();
	} 
}
