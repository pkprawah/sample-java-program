package threading;

import java.io.IOException;

public class PrinterQueueTest {

	public static void main(String[] args) throws IOException {
		/*
		 * PrinterQueue printerQueue = new PrinterQueue(); Thread thread[] = new
		 * Thread[10]; for (int i = 0; i < 10; i++) { thread[i] = new Thread(new
		 * PrintingJob(printerQueue), "Thread " + i); }
		 * 
		 * for (int i = 0; i < 10; i++) {
		 * System.out.println("Thread created...Calling "); thread[i].start(); }
		 */

		Reader reader = new Reader();
		reader.doReadFile();
	}

}
