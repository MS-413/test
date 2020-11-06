package constructor;

import java.util.Random;
import java.util.Scanner;

public class ya9 {
	Random r;
	Scanner sc;
	String com = "";
	String player = "";
	int strike = 0;
	int ball = 0;
	public ya9() {
		System.out.println("야구게임 시작 !\n");
		r = new Random();
		sc = new Scanner(System.in);
		ComNumber();
		InputNumber();
	}
	public static void main(String[] args) {
		new ya9();
	}
	
	void ComNumber() {
		while(com.length() < 3) {
			int num = (r.nextInt(9))+1;
			if(!com.contains(""+num))
				com+=num;
		}
	}
	
	void InputNumber() {
		System.out.print("숫자 입력 : ");
		try {
			player = sc.nextLine();
			Integer.parseInt(player);
		}catch (Exception e) {
			System.out.println("숫자만 입력");
			InputNumber();
		}
		System.out.println(player);
		Compare();
	}
	
	void Compare() {
		strike = 0;
		ball = 0;
		if(com.equals(player))
			System.out.println("이겼습니다.");
		else {
			for(int i = 0; i<3;i++) {
				if(com.charAt(i)==player.charAt(i))
					strike++;
				else if(com.contains(""+player.charAt(i)))
					ball++;
			}
			System.out.println("S : "+strike+"\nB : "+ball);
			InputNumber();
		}
	}

	
}
