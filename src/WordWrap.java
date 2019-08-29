public class WordWrap {

	public static void main(String args[]) {

		 //WordWrap.wrap("this is a test", 4);
		//WordWrap.wrap("a lot of words for a single line", 10);
		 //WordWrap.wrap("a longword", 6);
		 //WordWrap.wrap("areallylongword", 6);
		 //WordWrap.wrap("a longword", 6);
		 //WordWrap.wrap("Hello World", 7);
		//WordWrap.wrap("aaa aaaa a", 3);
		//WordWrap.wrap("a a aaa", 3);
		WordWrap.wrap("a aaaa a", 3);
	}

	public static String wrap(String input, int limit) {
		StringBuilder sb = new StringBuilder(input);

		int i = 0;
		int add = 0;
		while (i + limit < sb.length() - add) {
			
			if (sb.lastIndexOf(" ", i + limit + add) != -1 && sb.indexOf(" ", i+1-add) != -1) {				
				i = sb.lastIndexOf(" ", i + limit + add);

				if(sb.indexOf(" ", i+1-add) != -1 || (sb.length() - (i+1-add)) <= limit) {
				
				sb.replace(i, i + 1, "\n");
				add = add + 1;
				} else {
					sb.insert(limit, "\n");
					if(sb.charAt(limit+1) == ' ') {
						sb.deleteCharAt(limit+1);
					}
					if(i < limit) {
						i = limit + 1;
					} else {
					    i = i + limit + 1;
					}
				}
			} else {
				sb.insert(i+limit, "\n");
				i = i + limit + 1;
			}
		}
		System.out.println(sb.toString());
		return sb.toString().trim();
	}
}