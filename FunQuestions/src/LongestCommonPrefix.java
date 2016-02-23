// William Thing

public class LongestCommonPrefix {
	
	public static void main(String[] arg) {
		String[] prefix = {	"hill",
							"hi",
							"hicky"};
		String[] noPrefix = {"jim", "jig", "j", "no"};
		String result = longestCommonPrefix(prefix);
		String result2 = longestCommonPrefix(noPrefix);
		System.out.println(result);
		System.out.println(result2);

		
	}

    public static String longestCommonPrefix(String[] strings) {
        int size = strings.length;
        if (size == 0) return "";
        StringBuilder s = new StringBuilder(strings[0]);
        for (int i = 1; i < size; i++) {
        	while (!strings[i].startsWith(s.toString()))
        		s.deleteCharAt(s.length()-1);
        }
        return s.toString();
    }
    
    public static void truthDetector(boolean bool) {
    	if (bool)
    		System.out.println("TRUE");
    	else
    		System.out.println("FALSE");
    }
}
