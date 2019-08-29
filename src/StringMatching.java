import java.util.Arrays;

public class StringMatching {

	public static boolean solution1(String str, String ending) {
		return str.length() >= ending.length() ? str.substring(str.length() - ending.length()).equals(ending) : false;

	}

	public static boolean solution(String str, String ending) {

		for (int i = ending.length() - 1, j = str.length() - 1; i >= 0; i--, j--) {
			if (str.charAt(j) != ending.charAt(i)) {
				return false;
			}

		}

		return true;

	}
	
	public static String reverseWords1(String str){
		
		// w, x, y , z =>  z, y, x , w 
		
		// w, x => x, w 
		// x, w, y => y, x, w
		
		
	     return Arrays.stream(str.split(" ")).reduce((x, y) -> y+" "+x).get();
	 }

	public static String reverseWords(String str) {

		String[] strArray = str.split(" ");

		StringBuffer result = new StringBuffer();

		for (int i = strArray.length - 1; i >= 0; i--) {
			result.append(strArray[i]).append(" ");
		}
		return result.toString().substring(0, result.length() - 1);

	}

	public static void main(String args[]) {
		//System.out.println(solution("samurai", "ai"));
		
		System.out.println(reverseWords1("eating like I"));
	}

}
