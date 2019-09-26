package Question;

public class ReverseStringWithoutChangeSplChar {

	public static void main(String[] args) {

		char[] charLetter = new char[] { 'A', ';', 'B', 'C', '=', 'D', 'E', '|', 'F', 'G', 'H', 'I' };

		int length = charLetter.length;

		int start = 0;
		int last = length - 1;
		for (int i = 0; i < charLetter.length; i++) {
			System.out.print(charLetter[i]);
		}

		while (start < last) {

			if (!Character.isAlphabetic(charLetter[start]))
				start++;
			else if (!Character.isAlphabetic(charLetter[last]))
				last--;
			else {

				char temp = charLetter[start];
				charLetter[start] = charLetter[last];
				charLetter[last] = temp;
				start++;
				last--;
			}
		}

		System.out.println();

		for (int i = 0; i < charLetter.length; i++) {
			System.out.print(charLetter[i]);
		}

	}

}
