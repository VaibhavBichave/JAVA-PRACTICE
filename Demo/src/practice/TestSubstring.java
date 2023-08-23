package practice;

public class TestSubstring {
	public static void main(String args[]) {
		String s = "Sachin Tendulkar", ss = "    Sachin";
		System.out.println(s.substring(7));// Tendulkar
		System.out.println(s.substring(0, 6));// Sachin
		System.out.println(s.substring(3, s.length()));

		System.out.println(s.toUpperCase());// SACHIN
		System.out.println(s.toLowerCase());// sachin
		System.out.println(s);// Sachin(no change in original)
		System.out.println(s.compareToIgnoreCase(ss));

		System.out.println(ss.trim());// Sachin
		System.out.println(s.startsWith("c", 2));// Sachin
		System.out.println(s.endsWith(s));
		System.out.println(s.substring(7));
	}
}