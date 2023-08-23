package oopl;

public class Month {

	public static void main(String[] args) {
		int month = 4;
		if (month == 12 || month == 1 || month == 2) {
			System.out.print("Winter");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.print("Summer");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.print("Spring");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.print("Autmn");
		} else {
			System.out.print("Invalid Month");
		}
	}

}
