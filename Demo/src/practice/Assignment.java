package practice;

class Counter {
	int count = 0;

	void increment() {
		count++;
	}

	int getValue() {
		return count;
	}
}

public class Assignment {

	public static void main(String[] args) {
		Counter headCount, tailCount;
		tailCount = new Counter();
		headCount = new Counter();
		for (int flip = 0; flip < 100; flip++) {
			if (Math.random() < 0.5) {
				headCount.increment();
			} else {
				tailCount.increment();
			}
		}
		System.out.println("There were " + headCount.getValue() + " head.");
		System.out.println("There were " + tailCount.getValue() + " tail.");
	}

}
