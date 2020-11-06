package constructor;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	int diceEye;
	int num;
	
	public Dice() {
		System.out.println("주사위 게임 시작");
		 rollDice();
		 guessNum();
	}
	public static void main(String[] args) {		
		new Dice();
	}
	
	void rollDice() {
		Random r = new Random();
		diceEye = r.nextInt(6)+1;
		System.out.println("주사위를 굴렸습니다. ");
	}

	@Override
	public String toString() {
		return "Dice [diceEye=" + diceEye + ", toString()=" + super.toString() + "]";
	}

	void guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		num = sc.nextInt();
		compareNum();
	}
	void compareNum() {
			if(num == diceEye)
				System.out.println("맞았습니다. ");
			else {
				System.out.println("땡!");	
				guessNum();
			}
	}
}
