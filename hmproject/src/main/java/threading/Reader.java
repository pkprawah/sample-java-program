package threading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
	// private Lock readerWriterLock = new ReentrantLock();

	public Reader() {

	}

	public synchronized void doReadFile() throws IOException {

		String fileName = "D:\\inputFile\\inputword.txt";
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String line;
		while (br.readLine() != null) {
			line = br.readLine();
			System.out.println(line);
		}
		br.close();

	}

}
