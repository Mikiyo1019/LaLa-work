package v3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNextHand implements NextHand{

	@Override
	public int decideHand() {
		int hand = -1;//とりあえずの初期値
		do {
			System.out.println("手を選択してください");
			System.out.println("0:グー 1:チョキ 2:パー");
			System.out.print(" > ");
			try {
				hand = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
				//e.printStackTrace();//エラー内容を表示するメソッド
				System.out.println("0～2の数字を入れてね");
				hand = -1;//繰り返しになる
			}
		} while (hand < 0 || hand > 2);
			return hand;
		
	}

}
