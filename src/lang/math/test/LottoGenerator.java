package lang.math.test;

import java.util.Random;

public class LottoGenerator {
	private final Random random = new Random();
	private int[] lottoNumbers;
	private int count;

	public int[] generate() {
		lottoNumbers = new int[6];
		count = 0;

		while (count < 6) {
			// 1~45
			int number = random.nextInt(45) + 1;

			//중복되지 않은 경우에만 배열에 추가
			if(isUnique(number)) {
				lottoNumbers[count] = number;
				count++;
			}
		}

		return lottoNumbers;
	}


	//중복 체크
	private boolean  isUnique(int num) {
		for (int i = 0; i < count; i++) {
			if(lottoNumbers[i] == num) {
				return false;
			}
		}

		return true;
	}
}
