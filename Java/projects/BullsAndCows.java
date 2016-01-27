/* William Thing
 * You are playing the following Bulls and Cows game with your friend: 
 * You write down a number and ask your friend to guess what the number 
 * is. Each time your friend makes a guess, you provide a hint that 
 * indicates how many digits in said guess match your secret number 
 * exactly in both digit and position (called "bulls") and how many 
 * digits match the secret number but locate in the wrong position 
 * (called "cows"). Your friend will use successive guesses and hints 
 * to eventually derive the secret number.

For example:

Secret number:  "1807"
Friend's guess: "7810"
Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
Write a function to return a hint according to the secret number
and friend's guess, use A to indicate the bulls and B to indicate
the cows. In the above example, your function should return "1A3B".

Please note that both secret number and friend's guess may contain
duplicate digits, for example:

Secret number:  "1123"
Friend's guess: "0111"
In this case, the 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 
is a cow, and your function should return "1A1B".
You may assume that the secret number and your friend's guess only 
contain digits, and their lengths are always equal.
 */

package projects;

import java.util.HashMap;
import java.util.Map;

public class BullsAndCows {
	
	public static void main(String[] arg) {
		//	TEST CASES
		System.out.println(getHint("1123", "0111"));	// 1A1B
		System.out.println(getHint("1807", "7810"));	// 1A3B
		System.out.println(getHint("1234", "0111"));	// 0A1B
		System.out.println(getHint("1111", "1111"));	// 4A0B
		
	}
	
	// pre:		assume that secret and guess are same size and only digits
	// post: 	takes given secret and guess string and compares to
	//			present count of bulls and cows
	public static String getHint(String secret, String guess) {
        Map<Character, Integer> secrets = new HashMap<Character, Integer>();
        Map<Character, Integer> guesses = new HashMap<Character, Integer>();
        int i = 0;
        int bulls = 0;
        int cows = 0;
        while (i < secret.length()) {
        	if (secret.charAt(i) == guess.charAt(i)) {
        		bulls++;
        	} else { 
        		trackCows(secrets, secret.charAt(i));
        		trackCows(guesses, guess.charAt(i));
        	}
        	i++;
        }
        
        for (char key : secrets.keySet()) {
        	if (guesses.containsKey(key)) {
        		cows += Math.min(secrets.get(key), guesses.get(key));
        	}
        }
        
        return bulls + "A" + cows + "B";
	}
	
	//	keeps track of the digits in guesses and secrets, if they are not bulls
	private static void trackCows(Map<Character, Integer> cows, char key) {
		if (!cows.containsKey(key)) {
			cows.put(key, 1);
		} else {
			cows.put(key, cows.get(key) + 1);
		}
	}
	
	public static String cowsAndBulls(String secret, String guess) {
	    int bull = 0;
	    int cow = 0;
	    int[] s = new int[10];
	    int[] g = new int[10];
	    for(int i = 0; i < secret.length(); i++) {
	    	if(secret.charAt(i) == guess.charAt(i)) bull++;
	    }
	    for(int i = 0; i < secret.length(); i++) {
	    	s[secret.charAt(i) - 48]++;
	    	g[guess.charAt(i) - 48]++;
	    }
	    for(int i = 0; i < 10; i++) {
	    	cow += Math.min(s[i],g[i]);
	    }
	    cow -= bull;
	    return bull + "A" + cow + "B";
	}
}
