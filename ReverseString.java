
public class ReverseString{
    public static void main(String[] args){
	String string = "Hello this is a new String.";
	reverseString(string);	
    }

    private static void reverseString(String string){
	char[] charArray = string.toCharArray();
	StringBuilder sb = new StringBuilder();
	for(var i=charArray.length-1;i>=0;i--)
	    sb.append(charArray[i]);
	    
	System.out.println(sb);
    } 
}
