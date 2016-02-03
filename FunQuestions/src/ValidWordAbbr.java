/*	William Thing
 * An abbreviation of a word follows the 
 * form <first letter><number><last letter>. 
 * Below are some examples of word abbreviations:

a) it                      --> it    (no abbreviation)

     1
b) d|o|g                   --> d1g

              1    1  1
     1---5----0----5--8
c) i|nternationalizatio|n  --> i18n

              1
     1---5----0
d) l|ocalizatio|n          --> l10n
Assume you have a dictionary and given a word, find whether 
its abbreviation is unique in the dictionary. A word's 
abbreviation is unique if no other word from the dictionary 
has the same abbreviation.

Example: 
Given dictionary = [ "deer", "door", "cake", "card" ]

isUnique("dear") -> false
isUnique("cart") -> true
isUnique("cane") -> false
isUnique("make") -> true
 */


public class ValidWordAbbr {
	private String[] abbrDict;

	public ValidWordAbbr(String[] dictionary) {
		abbrDict = new String[dictionary.length];
		int index = 0;
		for (String s : dictionary) {
			abbrDict[index++] = convertToAbbr(s);
		}
	}
	
	public void printDict() {
		for (String s : abbrDict) {
			System.out.println(s);
		}
	}
	
	public boolean isUnique(String word) {
		String abbr = convertToAbbr(word);
		for (String s : abbrDict) {
			if (s.equals(abbr)) return false;
		}
		return true;
	}
	
	public String convertToAbbr(String word) {
		if (word.length() <= 2) {
			return word;
		} else {
			return "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length()-1);
		}
	}
}
