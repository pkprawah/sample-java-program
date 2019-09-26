package ennum;

import java.io.IOException;

public class EnumTest {

	public static void main(String[] args) throws Exception {
		// usingEnumMethods();
		// usingEnumValueOf();
		usingEnumValues();
	}

	private static void usingEnumMethods() throws IOException {
		ThreadStateEnum thc = ThreadStateEnum.DEAD;
		System.out.println("priority is:" + thc.getPriority());

		thc = ThreadStateEnum.DEAD;
		System.out.println("Using overriden method." + thc.toString());

		thc = ThreadStateEnum.START;
		System.out.println("Using overriden method." + thc.toString());
		thc.setPriority(10);
		System.out.println("Enum Constant variable changed priority value=" + thc.getPriority());
		thc.close();
	}

	private static void usingEnumValueOf() {
		ThreadStateEnum th = Enum.valueOf(ThreadStateEnum.class, "START");
		System.out.println(th.getDetail() + " Thread Priority is ::" + th.getPriority());
	}

	private static void usingEnumValues() {
		ThreadStateEnum[] thArray = ThreadStateEnum.values();

		for (ThreadStateEnum th : thArray) {
			System.out.println("Thread state is  " + th.getDetail() + " and their priority ::	" + th.getPriority());
		}
	}

}
