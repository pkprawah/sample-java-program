package hm.array;

public class Test1 {

	public static void main(String args[]) {
		try {
			args[0] = "0";
			return;
		} catch (Exception e) {
			System.out.print("pawan");
		} finally {
			System.out.print("sann");
		}

	}

}
