/* William Thing 
 * Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */

package projects;

public class ExcelColumnNumbers {

	public static void main(String[] arg) {
		System.out.println(titleToNumber("A"));
		System.out.println(titleToNumber("B"));
		System.out.println(titleToNumber("Z"));
		System.out.println(titleToNumber("AA"));
		System.out.println(titleToNumber("AB"));
	}
	
    public static int titleToNumber(String s) {
        int columNum = 0;
        char[] charA = s.toCharArray();
        for (char c : charA) {
        	columNum = (columNum * 26) + (c - 'A' + 1);
        }
        return columNum;
    }	
}
