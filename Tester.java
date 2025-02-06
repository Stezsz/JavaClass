public class Tester {
	public static void main(String[] args) {
		System.out.println();
	}

	public static int hasSharedDigit(int number, int number1) {
		if ((number < 10 || number > 99) || (number1 < 10 || number1 > 99)) {
			return -1;
		}

		int lastDigit = 0;
		int lastDigit1 = 0;
		int firstDigit = 0;
		int firstDigit1 = 0;

		lastDigit = number % 10;
		lastDigit1 = number1 % 10;
		firstDigit = number / 10;
		firstDigit1 = number1 / 10;

		if (lastDigit == lastDigit1 || lastDigit == firstDigit1 || firstDigit == lastDigit1 || firstDigit == firstDigit1) {
			return 1;
		} else {
			return 0;
		}
	}
}
