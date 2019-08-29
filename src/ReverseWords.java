
public class ReverseWords {

	
	public static void main(String args[]) {
		
		String str = "i like this program very much";		
		System.out.println(reverseWords(str));		
	}	
	
	static String reverseWords(String str) {
		
		String[] strArray = str.split(" ");
		StringBuffer reverseString = new StringBuffer();
		for (int i = strArray.length -1 ; i >= 0 ; i--) {
			reverseString.append(" ").append(strArray[i]);			
		}		
		return reverseString.toString();
	}
}
