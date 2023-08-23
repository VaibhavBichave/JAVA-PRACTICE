package practice;

class Addition {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

}

class Sequence {
	void disp(String s) {
		System.out.println(s);
	}

	void disp(String s, int num) {
		System.out.println(s + " " + num);
	}

	void disp(int num, String s) {
		System.out.println(num + " " + s);
	}
}

public class MethodOverloading {
	public static void main(String args[]) {
		Addition add = new Addition();
		add.sum(10, 20);
		add.sum(10, 20, 30);

		Sequence seq = new Sequence();
		seq.disp(100, "vaibhav");
		seq.disp("Hello", 5);
		seq.disp("Hello SE 10");
	}
}
