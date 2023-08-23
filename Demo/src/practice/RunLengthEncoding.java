package practice;

public class RunLengthEncoding {
	String Encode(String toEncode) {
		StringBuilder encoded=new StringBuilder();
		int counter=1;
		for(int i=1;i<=toEncode.length();++i) {
			if(i==toEncode.length() || toEncode.charAt(i)!=toEncode.charAt(i-1)) {
				encoded.append(counter);
				encoded.append(toEncode.charAt(i-1));
				counter=1;
			}
			else {
				counter++;
			}
		}
		return encoded.toString();
	}
	public static void main(String[] args) {
		String testcase1="AAAABCCCDD";
		RunLengthEncoding RunLengthEncoding=new RunLengthEncoding();
		System.out.println("String "+testcase1+" : "+RunLengthEncoding.Encode(testcase1));
		

	}

}
