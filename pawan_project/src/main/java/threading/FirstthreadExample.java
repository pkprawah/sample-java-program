package threading;

public class FirstthreadExample {

	Runnable myRunnable = new Runnable() {

		public void run() {

			System.out.println("My Runnable threads ");
		}
	};

	public void m1() {
		Thread thread = new Thread(myRunnable, "First Thread");
		thread.start();
		System.out.println("" + thread.getName());
	}

	public static void main(String[] args) {
		// ArrayList a = new ArrayList();

	}
}
