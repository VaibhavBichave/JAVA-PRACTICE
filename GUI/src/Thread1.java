import java.lang.Thread;

class Thread2 implements Runnable {
	synchronized public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("start thread 2 partly");
		}

	}
}

public class Thread1 extends Thread {
	synchronized public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("start thread 1 fully");
		}
	}

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread(new Thread2());

		t2.start();
		t1.start();

	}

}
