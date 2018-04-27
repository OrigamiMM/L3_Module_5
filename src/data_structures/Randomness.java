package data_structures;

import java.util.Random;

public class Randomness {
	public static boolean randomBool() {
		int num = new Random().nextInt(10);
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int randomInt() {
		int num1 = new Random().nextInt(10);
		return num1;
	}
}
