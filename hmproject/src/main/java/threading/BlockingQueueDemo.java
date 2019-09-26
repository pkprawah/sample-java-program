package threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) {
		try {
			BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(123);
			Producer producer = new Producer(blockingQueue);
			Consumer consumer = new Consumer(blockingQueue);

			new Thread(consumer).start();
			new Thread(producer).start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
