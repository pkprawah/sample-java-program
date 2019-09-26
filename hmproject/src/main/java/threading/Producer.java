package threading;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	protected BlockingQueue<String> queue = null;

	public Producer(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			queue.put("1");
			queue.put("2");
			queue.put("3");
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
