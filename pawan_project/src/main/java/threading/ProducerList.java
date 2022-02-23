package threading;

import java.util.List;

public class ProducerList implements Runnable {

	List<Integer> list;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (list) {
				list.add(i);
			}
		}

	}

}
