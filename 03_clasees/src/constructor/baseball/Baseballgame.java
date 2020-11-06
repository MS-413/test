package constructor.baseball;

import java.util.Scanner;

public class Baseballgame {
	// randomGenerate comRand = new randomGenerate();
	static String res = "";
	static int[] comNums = new int[3];
	
	public Baseballgame() {
		RandomGenerate comRanNums = new RandomGenerate();
		comRanNums.setRandomNums();

		for(;;) {
			gameLogic(comRanNums.getRandomNums());
			if(res == "삼진아웃!") {
				break;
			}
		}
	}
	static void gameLogic(int[] comRanNums) {
		int[] userNums = new int[3];
		int strike = 0;
		int ball = 0;
		for (int i = 0; i < comRanNums.length; i++) {
			comNums[i] = comRanNums[i];
			Scanner sc = new Scanner(System.in);
			System.out.print(" 숫자를 입력하세여");
			userNums[i] = sc.nextInt();
		}
		
		for (int j = 0; j < comNums.length; j++) {
			for (int q = 0; q < 3; q++) {
				if (j == q) {
					if (comNums[j] == userNums[q]) {
						strike++;
						break;
					}
				} else {
					if (comNums[j] == userNums[q]) {
						ball++;
						break;
					}
				}
			}
		}
		if (strike == 3) {
			res = "삼진아웃!";
		} else if (strike == 0 && ball == 0) {
			res = "유레카";
		} else {
			res = strike + "s" + ball + "b";
		}
		System.out.println(res);
	}
}
