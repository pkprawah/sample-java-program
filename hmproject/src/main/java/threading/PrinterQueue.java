package threading;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterQueue {

	private Lock printerQueueLocker = new ReentrantLock();

	public PrinterQueue() {

	}

	public void doPrintJob(Object obj) {
		printerQueueLocker.lock();
		try {
			Long duration = (long) (Math.random() * 10000);
			System.out.println(Thread.currentThread().getName() + ": PrintQueue: Printing a Job during "
					+ (duration / 1000) + " seconds :: Time - " + new Date());
			Thread.sleep(duration);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.printf("The document has been printed\n", Thread.currentThread().getName());
			printerQueueLocker.unlock();
		}

	}

}
