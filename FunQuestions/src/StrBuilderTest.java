/*
 * William Thing
 * messing with String Builder
 */
public class StrBuilderTest {
	public static void main(String[] arg) {
		StringBuilder builder = new StringBuilder();
		builder.append("Hello World");
		builder.append(" , I am testing string builder!!");
		String s = builder.toString();
		System.out.println(s);
	}

}
