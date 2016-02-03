
public class ValidWordAbbrTest {

	public static void main(String[] args) {
		String[] dictionary = { "deer", "door", "cake", "card" };
		ValidWordAbbr result = new ValidWordAbbr(dictionary);
		result.printDict();
		
		System.out.println(result.isUnique("dear")); // false
		System.out.println(result.isUnique("cart")); // true
		System.out.println(result.isUnique("cane")); // false
		System.out.println(result.isUnique("make")); // true
	}

}
