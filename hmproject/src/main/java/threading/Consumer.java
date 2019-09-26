package threading;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	protected BlockingQueue<String> queue = null;

	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			String s1 = queue.take();
			System.out.println("First queue value::" + s1);
			String s2 = queue.take();
			System.out.println("Second queue value::" + s2);
			String s3 = queue.take();
			System.out.println("Third queue value::" + s3);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
