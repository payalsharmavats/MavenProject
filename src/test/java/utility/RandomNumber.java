package utility;

import java.util.Random;

public class RandomNumber {
	public static int generateRandomNumber() {
		Random rnd = new Random();
		int ranNum = rnd.nextInt(1000);
		return ranNum;

	}

}
