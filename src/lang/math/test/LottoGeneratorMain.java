package lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {
	public static void main(String[] args) {
		LottoGenerator lottoGenerator = new LottoGenerator();
		int[] lottoNumbers = lottoGenerator.generate();

		System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
	}
}
