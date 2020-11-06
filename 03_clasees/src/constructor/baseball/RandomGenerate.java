package constructor.baseball;

import java.util.Random;

public class RandomGenerate {
	int[] ranNums;

	void setRandomNums() {
		ranNums = new int[3];
		Random r = new Random();
		for (int i = 0; i < ranNums.length; i++) {
			ranNums[i] = Math.abs(r.nextInt() % 9) + 1;
			for (int j = 0; j < i; j++) {
				if (ranNums[i] == ranNums[j]) {
					i--;
					break;
				}
			}
			System.out.print(ranNums[i]);
		}
		System.out.println();
	}

	int[] getRandomNums() {
		return this.ranNums;
	}
}
