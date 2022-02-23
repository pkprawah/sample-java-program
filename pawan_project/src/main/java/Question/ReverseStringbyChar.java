package Question;

public class ReverseStringbyChar {

	public static void main(String[] args) {
		String str = "I Love My India";

		String[] strarray = str.split(" ");
		for (int i = 0; i < strarray.length; i++) {
			char[] ch = strarray[i].toCharArray();
			for (int c = ch.length - 1; c >= 0; c--) {
				System.out.print(ch[c]);
			}
			System.out.print(" ");

		}
		System.out.println();
		System.out.println(str);

	}

}
