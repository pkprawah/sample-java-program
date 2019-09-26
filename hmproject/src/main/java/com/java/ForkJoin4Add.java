package com.java;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoin4Add extends RecursiveTask<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long[] numbers;
	private int start;
	private int end;
	public static final long threshold = 1000;

	public ForkJoin4Add(long[] numbers) {

		this(numbers, 0, numbers.length);
		System.out.println("ForkJoin4Add under constructor ::-> end " + numbers.length);

	}

	private ForkJoin4Add(long[] numbers, int start, int end) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
	}

	@Override
	protected Long compute() {

		long starttime = System.currentTimeMillis();

		int length = end - start;

		System.out.println("ForkJoin4Add ->start " + start + "end ::" + end + "length : " + length);

		if (length <= threshold) {
			return add();
		}

		ForkJoin4Add firstTask = new ForkJoin4Add(numbers, start, start + length / 2);
		System.out.println("ForkJoin4Add -> firstTask :: " + firstTask);
		firstTask.fork(); // start asynchronously

		ForkJoin4Add secondTask = new ForkJoin4Add(numbers, start + length / 2, end);
		// secondTask.fork(); // start asynchronously
		System.out.println("ForkJoin4Add -> secondTask:: " + secondTask);

		// ForkJoin4Add thirdTask = new ForkJoin4Add(numbers, start + length /
		// 10, start + length / 5);
		// thirdTask.fork(); // start asynchronously
		//
		// System.out.println("ForkJoin4Add -> thirdTask:: " + thirdTask);
		//
		// ForkJoin4Add fourTask = new ForkJoin4Add(numbers, start + length / 5,
		// end);
		//
		// System.out.println("ForkJoin4Add -> fourTask:: " + fourTask);

		// Long fourTaskResult = fourTask.compute();
		// Long thirdTaskResult = thirdTask.join();
		Long secondTaskResult = secondTask.compute();
		Long firstTaskResult = firstTask.join();

		long lasttime = System.currentTimeMillis();

		long difftime = starttime - lasttime;

		System.out.println("Time taken :::" + difftime);

		return firstTaskResult + secondTaskResult;// + thirdTaskResult +
													// fourTaskResult;

	}

	private long add() {
		long result = 0;
		for (int i = start; i < end; i++) {
			result += numbers[i];
		}
		return result;
	}

	@Override
	public String toString() {
		return "ForkJoin4Add [numbers=" + Arrays.toString(numbers) + ", start=" + start + ", end=" + end + "]";
	}

	public static long startForkJoinSum(long n) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(50);
		long[] numbers = LongStream.rangeClosed(1, n).toArray();
		System.out.println("startForkJoinSum -> number's length :: " + numbers.length);
		ForkJoinTask<Long> task = new ForkJoin4Add(numbers);
		return forkJoinPool.invoke(task);
	}

}
